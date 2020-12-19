package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application{

    @Override
    public void start(Stage window) {
        VBox layout = new VBox();
        
        TextField textField = new TextField("");
        Button updateButton = new Button("Update");
        Label text = new Label("");
        
        // putting all the components into one layout
        layout.getChildren().addAll(textField, updateButton, text);
        
        // event handling
        updateButton.setOnAction((event) -> {
            text.setText(textField.getText());
        });
        
        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(NotifierApplication.class);
    }

}
