import java.util.Arrays;

public class MonotonicArray {
    
    public static boolean isMonotonic ( int[] arr) {

        if ( arr == null || arr.length == 0) {
            return false;
        }

        boolean increasing = true;
        boolean decreasing = true;

        for ( int i =0; i < arr.length - 1; i ++){
            if ( arr[i] <= arr [i+1]) {
                decreasing = false;
            } 
            if (arr[i] >= arr [i+1]) {
                increasing = false;
            }

        }

        return increasing || decreasing;

    }

    public static void main ( String[] args){
        int [][] inputs = {
            {9, 8, 6, 2, 1},
            {-5, -4, -4, 6, -1},
            {-1, -2, -3, -4, -2},
            {1, 3, 2, 9, 10},
            {-7, -8, -9, -2, -1},
            {10, 10, 10, 10, 10},
            {1, 2, 3, 4, 5},


        };

        for ( int i = 0; i < inputs.length; i ++){
            System.out.print((i+1) + ".\tInput Array: ");
            System.out.print(Arrays.toString(inputs[i])+ "  ");
            System.out.println("Is Monotonic?   " + isMonotonic(inputs[i]) );
            System.out.println(new String (new char[100]).replace('\0', '-'));
        }
    }
    
}
