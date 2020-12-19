package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application{
    
    @Override
    public void start(Stage window) throws Exception{
        
        // creating main layout
        BorderPane layout = new BorderPane();
        
        // creating menu for main layout
        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);
        
        // creating button for menu 
        Button first = new Button("Joke");
        Button second = new Button("Answer");
        Button third = new Button("Explanation");
        
        // add button to menu
        menu.getChildren().addAll(first, second, third);
        
        layout.setTop(menu);
        
        // creating sub view layout
        StackPane firstView = createView("What do you call a bear with no teeth?");
        StackPane secondView = createView("A gummy bear.");
        StackPane thirdView = createView("It is a candy shaped bear");        
        
        // add event handler to button switch btw scene
        first.setOnAction((event) -> layout.setCenter(firstView));
        second.setOnAction((event) -> layout.setCenter(secondView));
        third.setOnAction((event) -> layout.setCenter(thirdView));
        
        // set intial view 
        layout.setCenter(firstView);
        
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }
    
    private StackPane createView(String text) {
        StackPane view = new StackPane();
        view.setPrefSize(300, 180);
        view.getChildren().add(new Label(text));
        view.setAlignment(Pos.CENTER);
        
        return view;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(JokeApplication.class);
    }
}
