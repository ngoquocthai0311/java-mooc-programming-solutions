package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application{

    @Override
    public void start(Stage window) throws Exception{
        // 1. Creating a view to ask for the name of the user 
        
        // 1.1 Creating components in the first view
        Label text = new Label("Enter your name and start.");
        TextField textField = new TextField();
        Button button = new Button("Start");
        
        // 1.2  Creating layout and adding components to it
        GridPane layout = new GridPane();
        layout.add(text, 0, 0);
        layout.add(textField, 0, 1);
        layout.add(button, 0, 2);
        
        // 1.3 styling the layout 
        layout.setPrefSize(300, 180);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        
        // 1.4 creating a view 
        Scene welcomView = new Scene(layout);
        
        // 2 creating view for showing greeting message 
        Label greeting = new Label("");
        
        StackPane greetingLayout = new StackPane();
        greetingLayout.setPrefSize(300, 180);
        greetingLayout.getChildren().add(greeting);
        greetingLayout.setAlignment(Pos.CENTER);
        
        Scene greetingScene = new Scene(greetingLayout);
        
        // 3. add even handler for button at welcome view 
        button.setOnAction((event) -> {
            window.setScene(greetingScene);
            greeting.setText("Welcome " + textField.getText() + "! ");
        });
        
        window.setScene(welcomView);
        window.show();
    }
    public static void main(String[] args) {
        System.out.println("Hellow world! :3");
        launch(GreeterApplication.class);
    }
}
