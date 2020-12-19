package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class SmileyApplication extends Application{
    
    @Override
    public void start(Stage window) {
        Canvas paintingCanvas = new Canvas(640, 480);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();
        
        ColorPicker colorPalette = new ColorPicker();
        
        BorderPane paintingLayout = new BorderPane();
        
        paintingLayout.setCenter(paintingCanvas);
        paintingLayout.setRight(colorPalette);
        
        painter.setFill(Color.BLACK);
        painter.fillRect(250, 100, 50, 50);
        painter.fillRect(450, 100, 50, 50);
        painter.fillRect(200, 250, 50, 50);
        painter.fillRect(500, 250, 50, 50);
        painter.fillRect(250, 300, 250, 50);
        
        
        paintingCanvas.setOnMouseDragged((event) -> {
            double xLocaiton = event.getX();
            double yLocation = event.getY();
            
            painter.setFill(colorPalette.getValue());
            painter.fillOval(xLocaiton, yLocation, 4, 4);
        });
        
        Scene scene = new Scene(paintingLayout);
        window.setScene(scene);
        window.show();
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(args);
    }

}
