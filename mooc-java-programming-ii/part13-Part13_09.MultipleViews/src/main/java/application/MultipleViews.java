package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application{

    @Override
    public void start(Stage window) {          
        
        // first view layout
        BorderPane firstLayout = new BorderPane();
        Label textFirst = new Label("First view!");
        Button buttonFirst = new Button("To the second view!");
        firstLayout.setTop(textFirst);
        firstLayout.setCenter(buttonFirst);
        
        // second view layout 
        VBox secondLayout = new VBox();
        Button buttonSecond = new Button("To the third view!");
        Label textSecond = new Label("Second view!");
        secondLayout.getChildren().addAll(buttonSecond, textSecond);
        
        // third view layout 
        GridPane thirdLayout = new GridPane(); 
        Button buttonThird = new Button("To the first view!");
        Label textThird = new Label("Third view!");
        thirdLayout.add(textThird, 0, 0);
        thirdLayout.add(buttonThird, 1, 1);        
        
        // scene setup
        Scene first = new Scene(firstLayout);
        Scene second = new Scene(secondLayout);
        Scene third = new Scene(thirdLayout);
        
        // event handling
        buttonFirst.setOnAction((event) -> {
            window.setScene(second);
        });
        buttonSecond.setOnAction((event) -> {
            window.setScene(third);
        });
        buttonThird.setOnAction((event) -> {
            window.setScene(first);
        });
        
        window.setScene(first);
        window.show();
    }         
    
    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(MultipleViews.class);
    }
    
}
