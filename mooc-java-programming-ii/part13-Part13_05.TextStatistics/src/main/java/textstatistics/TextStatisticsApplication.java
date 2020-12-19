package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;



public class TextStatisticsApplication extends Application{

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        
        TextArea text = new TextArea("");
        Label text1 = new Label("Letters: 0");
        Label text2 = new Label("Words: 0");
        Label text3 = new Label("The longest word is:");
        
        HBox texts = new HBox();
        texts.setSpacing(10);
        texts.getChildren().add(text1);
        texts.getChildren().add(text2);
        texts.getChildren().add(text3);
        
        layout.setCenter(text);
        layout.setBottom(texts);
        
        Scene view = new Scene(layout);
        
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(TextStatisticsApplication.class);
    }

}
