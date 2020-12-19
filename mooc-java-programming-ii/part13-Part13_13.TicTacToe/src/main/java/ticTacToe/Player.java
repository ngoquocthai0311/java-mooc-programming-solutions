/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

/**
 *
 * @author ADMIN
 */
public class Player {
    private String mark;
    private int marked[][];

    public Player(String mark, int size) {
        this.mark = mark;
        this.marked = new int[size][size];
        
        // initilize marked matrix
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                this.marked[i][j] = 0;
            }
        }
    }   
    
    public boolean isWin(int currentX, int currentY) {     
        int size = this.marked.length;        
        
        // check row
        for (int i = 0; i < size; i++) {
            if (this.marked[currentX][i] != 1) {
                break;
            }
            if (i == size - 1) {
                return true;
            }            
        }
        
        // check col 
        for (int i = 0; i < size; i++) {
            System.out.println("check col at x: " + i + "; y: " + currentY + "; value: " + this.marked[i][currentY]);
            if (this.marked[i][currentY] != 1)  {
                break;
            }
            if (i == size - 1) {
                return true;
            }
        }
        
        // check diagonal 
        if (currentX == currentY) {            
            for (int i = 0; i < size; i++) {                
                if (this.marked[i][i] != 1) {
                    break;
                }
                if (i == size - 1) {
                    return true;
                }   
            }    
            return false;
        }
        
        // check anti-diagonal    
        for (int i = 0; i < size; i++) {            
            if (this.marked[i][size - 1 - i] != 1) {
                break;
            }
            if (i == size - 1) {
                return true;
            }
        }                
        return false;
    }
    
    public boolean marked(int x, int y) {
        this.marked[x][y] = 1;
        return isWin(x, y);
    }

    public String getMark() {
        return mark;
    }            
}
