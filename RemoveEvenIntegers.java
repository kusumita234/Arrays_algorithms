import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class RemoveEvenIntegers{

    public static int[] removeEven(int[] arr){
        if ( arr == null || arr.length ==0){
            return null;
        }

        // 1. ###### Way 1: ceate a LinkedList and then convert to array
        List<Integer> removedEvenlist = new ArrayList<>();
        for ( int i : arr){
            if( i % 2 !=0) {
                removedEvenlist.add(i);
            }
        }
        if(removedEvenlist.size()== 0) {
            return null;
        }
        
        return (Arrays.stream(removedEvenlist.toArray( new Integer[0])).mapToInt(Integer::intValue).toArray());

        // 2. ######Naive way - extra computation #####

        // int no_of_odds = 0;
        // for ( int i=0; i < arr.length; i++){
        //     if( arr[i] % 2 !=0){
        //         no_of_odds++;
        //     }
        // }
        // if(no_of_odds == 0){
        //     return null;
        // }

        // int [] odds = new int[no_of_odds];
        // int odd_index =0;
        // for ( int i=0; i < arr.length; i++){
        //     if( arr[i] % 2 !=0){
        //         odds[odd_index++] = arr[i];
        //     }
        // }
        // return odds;

    }
    public static void main ( String[] args){
        int[][] inputs = {
            {3, 2, 41, 3, 34},
            {-5, -4, -3, -2, -1},
            {-1, 2, 3, -4, -10},
            {1, 2, 3, 7},
            {2, 4, 6, 8, 10}
        };
        for ( int i=0; i< inputs.length; i++){
            System.out.print((i+1) + ".\tInput List: ");
            System.out.println(Arrays.toString(inputs[i]));

            int [] result = removeEven (inputs[i]);
            System.out.print("\n\tFinal List: ");
            System.out.println(Arrays.toString(result));
            System.out.println(new String (new char[100]).replace('\0', '-'));
        }
    }

    
    
}