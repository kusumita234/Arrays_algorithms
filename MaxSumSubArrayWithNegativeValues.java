import java.util.Arrays;
import java.util.Collections;

public class MaxSumSubArrayWithNegativeValues {

    public static int findMaxSum ( int arr[]) {

       if ( arr == null || arr.length == 0){
        return Integer.MIN_VALUE;
       }


        int maxSum = arr[0];
        int currentMax = arr[0];

        //System.out.println ("i = 0 maxSum= " + maxSum + " currentMax= " + currentMax);



       for (int i =1; i < arr.length; i++) {
            currentMax = Math.max (arr[i], currentMax + arr[i]);
            if ( currentMax > maxSum) {
            maxSum = currentMax;
            }

            //System.out.println ("i = " + i +  " maxSum= " + maxSum + " currentMax= " + currentMax);
       }
       
       return maxSum;

    }

    public static void main ( String [] args){
        int [][] inputs = {
            {1, 2, 2, 3, 3, 1, 4},
            {2, 2, 1},
            {4, 1, 2, 1, 2},
            {-4, -1, -2, -1, -2},
            {-4, 2, -5, 1, 2, 3, 6, -5, 1},
            {25}

        };


        for ( int i = 0; i < inputs.length; i++){
            System.out.println((i + 1) + ".\tArray: " + Arrays.toString(inputs[i]));

            int maxSum = findMaxSum (inputs[i]);
            System.out.println(" \tMaxSum: " + maxSum);
            
            System.out.println('-' +String.join("", Collections.nCopies(100, "-")) + '\n' );
            //System.out.println(Collections.nCopies(100, "-")); // works, but the comma comes after each dash
            //System.out.println(String.join("", Collections.nCopies(100, "-")) + '\n' );



        }
    }


}
