package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
// import ui components
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.stage.Stage;

public class ButtonAndLabelApplication extends Application{
    
    @Override
    public void start(Stage window) {
        Label text = new Label("Text");
        Button button = new Button("Button");
        
        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(button);
        componentGroup.getChildren().add(text);
        
        Scene scene = new Scene(componentGroup);
        
        window.setScene(scene);
        window.show();        
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(ButtonAndLabelApplication.class);
    }

}
