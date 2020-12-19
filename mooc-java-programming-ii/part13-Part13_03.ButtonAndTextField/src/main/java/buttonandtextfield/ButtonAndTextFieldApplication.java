package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ButtonAndTextFieldApplication extends Application{

    @Override
    public void start(Stage window) {
        Button button = new Button("button");
        TextField text = new TextField("hihi");
        
        FlowPane componentUI = new FlowPane();
        componentUI.getChildren().add(button);
        componentUI.getChildren().add(text);
        
        Scene scene = new Scene(componentUI);
        
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(ButtonAndTextFieldApplication.class);
    }

}
