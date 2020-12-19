package ticTacToe;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class TicTacToeApplication extends Application{        
    @Override
    public void start(Stage window) {               
        
        BorderPane layout = new BorderPane();
        Board board = new Board();        
        Label text = new Label("Turn: X");
        text.setFont(Font.font("Monospaced", 40));                
        
        layout.setTop(text);
        layout.setCenter(board.getBoard(text));
               
        
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(TicTacToeApplication.class);
    }

}
