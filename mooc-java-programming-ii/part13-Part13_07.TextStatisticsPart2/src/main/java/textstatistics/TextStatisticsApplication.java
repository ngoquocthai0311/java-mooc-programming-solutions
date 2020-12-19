package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application{

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        
        TextArea texts = new TextArea("");
        HBox notis = new HBox();
        notis.setSpacing(10);
        Label letters = new Label("Letters: 0");
        Label words = new Label("Words: 0");
        Label longest = new Label("The longest word is: ");
        notis.getChildren().addAll(letters, words, longest);
        
        layout.setCenter(texts);
        layout.setBottom(notis);
        
        //event handling 
        texts.textProperty().addListener((change, oldValue, newValue) -> {
            // update the letters length
            letters.setText("Letters: " + newValue.length());
            // update the words length
            String[] parts = newValue.split(" ");
            words.setText("Words: " + parts.length);
            // longest word 
            String longestString = parts[0];
            for (int i = 1; i < parts.length; i++)  {
                if (parts[i].length() > longestString.length()) {
                    longestString = parts[i];
                }
            }
            longest.setText("The longest word is: " + longestString);
        });
        
        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }     

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(TextStatisticsApplication.class);
    }

}
