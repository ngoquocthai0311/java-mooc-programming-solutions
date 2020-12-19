/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

import javafx.event.Event;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

/**
 *
 * @author ADMIN
 */
public class Board {
    private final static int SIZE_OF_THE_BOARD = 3;
    
    private GridPane board;    
    private Player x;
    private Player o;
    private int turn;
    
    public Board() {
        this.board = new GridPane();
        this.x = new Player("X", SIZE_OF_THE_BOARD);
        this.o = new Player("O", SIZE_OF_THE_BOARD);
        this.turn = 1;
    }        
    
    public Parent getBoard(Label text) {                  
        for (int i = 0; i < SIZE_OF_THE_BOARD; i++) {
            for (int j = 0; j < SIZE_OF_THE_BOARD; j++) {
                Button button = new Button(" ");
                button.setFont(Font.font("Monospaced", 40));
                board.add(button, i, j);    
                GridPane.setConstraints(button, i, j);
                
                // event handler on each button
                button.setOnMouseClicked((event -> {                    
                    int x = GridPane.getRowIndex(button);
                    int y = GridPane.getColumnIndex(button);                    
                    marked(button, text, x, y);
                }));                                
            }
        }
        return board;
    }         
    
    public int getTurn() {
        return this.turn;
    }
    
    private void marked(Button button, Label text, int indexX, int indexY) {        
        if (isAleardyMarked(button)) {
            return;
        }
        
        if (this.turn % 2 == 0) {                                 
            button.setText(o.getMark());
                
            // check if win 
            boolean flag = this.o.marked(indexX, indexY);            
            if (flag) {                
                text.setText("The end!");   
                return;
            }
            
            text.setText("Turn: X");
        } else {            
            button.setText(x.getMark());
            
            boolean flag = this.x.marked(indexX, indexY);            
            if (flag) {
                text.setText("The end!");
                return;
            }
            
            text.setText("Turn: O");
        }                        
        this.turn++;
        
        // check if draw
        if (isFull()) {
            text.setText("Draw");
        }
    }
    
    // check if already contain Xs or Os
    public boolean isAleardyMarked(Button button) {
        if (button.getText().equals(" ")) {
            return false;
        }
        return true;
    }
    
    // check if the board is fully marked on
    public boolean isFull() {
        if (this.turn == SIZE_OF_THE_BOARD * SIZE_OF_THE_BOARD + 1) {
            return true;
        }
        return false;
    }
}
