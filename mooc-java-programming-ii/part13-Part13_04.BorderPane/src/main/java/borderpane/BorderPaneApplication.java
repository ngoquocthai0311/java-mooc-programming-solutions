package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class BorderPaneApplication extends Application{

    @Override
    public void start(Stage window) {
        
        Label north = new Label("NORTH");
        Label south = new Label("SOUTH");
        Label east = new Label("EAST");
        
        BorderPane layout = new BorderPane();       
        layout.setTop(north);
        layout.setBottom(south);
        layout.setRight(east);
        
        Scene view = new Scene(layout);
        
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(BorderPaneApplication.class);
    }

}
