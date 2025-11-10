import java.util.HashSet;
import java.util.Arrays;
import java.util.Collections;

public class TwoSumNumbers {

    public static int[] findTwoSum( int[] arr, int sum){

        if ( arr == null || arr.length == 0){
            return null;
        }

        HashSet<Integer> set = new HashSet<>();
        for ( int i : arr){
            int difference = sum - i;
            if ( set.contains(difference)){
                int [] result = new int[2];
                result[0] = i;
                result[1] = difference;
                return result;
            } else {
                set.add(i);
            }
        }

        return null;

    }

    public static void main ( String [] args){
        int [][] inputs = {
            {1,2,3,4},
            {1,2},
            {2,2},
            {-4, -1, -9, 1, -7},
            {25, 50, 75, 100, 400}

        };

        int [] k = {5, 3, 4, -3, 425};

        for ( int i = 0; i < inputs.length; i++){
            System.out.println((i + 1) + ".\tArray: " + Arrays.toString(inputs[i]));
            System.out.println(" \tk: " + k[i]);

            int [] result = findTwoSum (inputs[i], k[i]);
            System.out.println(" \tResult: " + Arrays.toString(result));
            
            System.out.println('-' +String.join("", Collections.nCopies(100, "-")) + '\n' );
            //System.out.println(Collections.nCopies(100, "-")); // works, but the comma comes after each dash
            //System.out.println(String.join("", Collections.nCopies(100, "-")) + '\n' );



        }
    }
    
}
