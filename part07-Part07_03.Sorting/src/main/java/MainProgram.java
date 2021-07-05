
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }
    
     public static int smallest(int[] array) {
        int smallest = array[0];
        
        for (int element : array) {
            if (element < smallest) {
                smallest = element;
            }
        }
        
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int indexSmallest = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[indexSmallest]) {
                indexSmallest = i;
            }
        }
        
        return indexSmallest;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int indexSmallest = startIndex;
        
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < table[indexSmallest]) {
                indexSmallest = i;
            }
        }
        
        return indexSmallest;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int valueThatWasAtIndex1 = array[index1];
        array[index1] = array[index2];
        array[index2] = valueThatWasAtIndex1;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }

}
