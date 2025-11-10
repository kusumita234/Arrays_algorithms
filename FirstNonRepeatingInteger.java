import java.util.Arrays;
import java.util.HashMap;

public class FirstNonRepeatingInteger {

    public static int firstNonRepeatingInteger( int [] arr){
        if ( arr == null || arr.length ==0){
            return Integer.MAX_VALUE;
        }
       
        HashMap<Integer, Integer> map = new HashMap<>();

        for ( int i : arr){
            map.put ( i, map.getOrDefault(i, 0) + 1);
        }

        for ( int i =0; i < arr.length; i++) {
            if (map.get(arr[i]) == 1 ){
               return arr[i];
            }
        }
        return Integer.MAX_VALUE;

    }

    public static void main ( String[] args){
        int [][] inputs = {
            {9, 2, 3, 2, 6, 6},
            {-5, -4, -4, 6, -1},
            {-1, 2, -1, -4, -10},
            {1, 1, 2, 9},
            {-2, 2, -2, 2, 5}
        };

        for ( int i = 0; i < inputs.length; i ++){
            System.out.print((i+1) + ".\tInput List: ");
            System.out.println(Arrays.toString(inputs[i]));

            int uniqueNumber = firstNonRepeatingInteger(inputs[i]);

            System.out.println("\n\tFirst Non Repeating Integer: " +  (uniqueNumber != Integer.MAX_VALUE ? uniqueNumber : "None"));
            System.out.println(new String (new char[100]).replace('\0', '-'));
        }

    }
    
}
