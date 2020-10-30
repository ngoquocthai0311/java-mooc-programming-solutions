import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int smallest = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[smallest]) {
                smallest = i;
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallestFrom(int[] array, int startIndex) {        
        int smallest = startIndex;
        for (int i = startIndex + 1; i < array.length; i++) {
            if (array[smallest] > array[i]) {
                smallest = i;
            }
        }
        
        return smallest;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    // selection sort
    public static void sort(int[] array) {        
        for (int i = 0; i < array.length; i++) {            
            System.out.println(Arrays.toString(array));
            int smallestIndex = i;
            swap(array, i, indexOfSmallestFrom(array, i));                                               
            
        }        
    }    
    
    public static void print(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }       
        System.out.print(array[array.length - 1]);
    }
}
