/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author ADMIN
 */
public class PracticeView {
    private Dictionary dict;
    private String word;

    public PracticeView(Dictionary dict) {
        this.dict = dict;
        this.word = "";
    }
    
    public Parent getView() throws NullPointerException{                
        GridPane layout = new GridPane();
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));  
        
        try {
            this.word = this.dict.getRandomWord();
        } catch (IllegalArgumentException e) {         
            Label errorText = new Label("Please add a new pair of words");
            layout.add(errorText, 0, 0);
            return layout;
        }        
        
        Label challengeText = new Label("Translate the word " + this.word);
        
        TextField answerField = new TextField();
        Label feedback = new Label("");                                      
        
        Button button = new Button("Check");
        
        layout.add(challengeText, 0, 0);
        layout.add(answerField, 0, 1);
        layout.add(button, 0, 2);
        layout.add(feedback, 0, 4);
        
        button.setOnMouseClicked((event) -> {
            String answer = answerField.getText();
            if (answer.equals(this.dict.getTranslation(this.word))) {
                feedback.setText("Correct");               
            } else {
                feedback.setText("Uncorrect");
            }
            
            this.word = this.dict.getRandomWord();
            challengeText.setText("Translate the word " + this.word);
            answerField.clear();
        });                
        
        return layout;
    }       
}
