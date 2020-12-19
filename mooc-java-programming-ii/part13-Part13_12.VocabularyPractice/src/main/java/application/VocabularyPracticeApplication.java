package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


// END SOLUTION
public class VocabularyPracticeApplication extends Application{
    
    private Dictionary dictionary;
    
    @Override
    public void init() throws Exception {
        // 1. Create the dictionary that the application uses
        this.dictionary = new Dictionary();
    }
    
    @Override
    public void start(Stage window) throws Exception{
        
        InputView inputView = new InputView(dictionary);
        PracticeView practiceView = new PracticeView(dictionary);
        
        // create main layout
        BorderPane layout = new BorderPane();
        
        // create Menu 
        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);
        
        // create menu components 
        Button enterButton = new Button("Enter new words");
        Button practiceButton = new Button("Practice");                
        
        menu.getChildren().addAll(enterButton, practiceButton);
        
        layout.setTop(menu);
        
        
        
        // event handler 
        enterButton.setOnMouseClicked((event) -> layout.setCenter(inputView.getView()));
        practiceButton.setOnMouseClicked((event) -> layout.setCenter(practiceView.getView()));
        
        // intialize view
        layout.setCenter(inputView.getView());
        
        Scene scene = new Scene(layout, 400, 300);
        window.setScene(scene);
        window.show();
    }


    public static void main(String[] args) {
        System.out.println("Hello");
        launch(VocabularyPracticeApplication.class);
    }
}
