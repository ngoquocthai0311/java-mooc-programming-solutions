
public class MagicSquareFactory {
      
    private MagicSquare square;
    private int col;
    private int row;
    
    public MagicSquare createMagicSquare(int size) { 
        if (size % 2 != 0) {
            return createSquare(size, size * size);
        }   
        return null;
    }
    
    private boolean isOutOfBound(int x, int y) {        
        return x < this.square.getWidth() || y < this.square.getHeight();
    }       
    
    private boolean hasValue(int x, int y) {
        if (this.square.readValue(x, y) == 0) {
            return false;
        }
        return true;
    }
    
    private void incrementIndex(int size) {                    
        int tempRow = this.row - 1;
        int tempCol = this.col + 1;       
        if (isOutOfBound(tempRow, tempCol)) {                  
            tempRow = mod(tempRow, size);
            tempCol = mod(tempCol, size);            
        }              
        
        if (hasValue(tempRow, tempCol)) {            
            tempRow = this.row + 1;
            tempCol = this.col;         
        }                    
        // basic increment
        this.row = tempRow;
        this.col = tempCol;
    }        
    
    private MagicSquare createSquare(int size, final int maxValue) {
        this.square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here                
        int value = 1;       
        // find the center most index at the first col        
        this.col = size / 2;
        this.row = 0;
        // begin to make it
        while (value <= maxValue) {    
            this.square.placeValue(this.row, this.col, value);
            this.incrementIndex(size);                     
            value++;
        }   
        return square;
    }
    
    private int mod(int x, int y) {
        int result = x % y;
        if (result < 0) {
            result += y;
        }
        return result;
    }
}
