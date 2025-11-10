import java.util.Arrays;

public class FindMinimumValue {
    
    public static int findMinimumValue ( int [] arr){
        if ( arr ==null || arr.length == 0) {
            return -1;
        }
        int min = arr[0];
        for( int i = 1; i < arr.length; i++){
            if (arr[i] < min) {
                min = arr[i];
            }  
        }
        return min;
    }

    public static void main ( String[] args){
        int [][] inputs = {
            {9},
            {-1, -5, -10, -2, -4},
            {4,3,2,1},
            {2, 3, 3, -1, -1},
            {100, 50, 75, 25, 400}
        };

        for ( int i = 0; i < inputs.length; i ++){
            System.out.print((i+1) + ".\tInput List: ");
            System.out.println(Arrays.toString(inputs[i]));

            System.out.println("\n\tMinimum Value: " + findMinimumValue(inputs[i]));
            System.out.println(new String (new char[100]).replace('\0', '-'));
        }
    }
}
