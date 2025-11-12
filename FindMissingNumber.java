import java.util.Arrays;
import java.util.HashSet;

public class FindMissingNumber {
    public static int missingNumber ( int [] numbers){
        if( numbers == null || numbers.length ==0){
            return -1;
        }
        HashSet<Integer> set = new HashSet<>();

        for ( int i : numbers) {
            set.add(i);
        }
        for ( int i =0; i <= numbers.length; i++){
            if( !set.contains(i)){
                return i;
            }

        }
        return -1;
    }
     public static void main ( String[] args){
        int [][] inputs = {
            {4, 6, 0, 2, 1, 3},
            {2,6,7,3,1,5,0,4},
            {0,4,2,3},
            {1, 3, 2},
            {6,7,8,9,0,1,2,3,4}
        };

        for ( int i = 0; i < inputs.length; i ++){
            System.out.print((i+1) + ".\tInput Array: ");
            System.out.println(Arrays.toString(inputs[i]));

            int missingNumber = missingNumber(inputs[i]);

            System.out.println("\n\tMissing Number : " +  (missingNumber != -1 ? missingNumber : "None"));
            System.out.println(new String (new char[100]).replace('\0', '-'));
        }

    }
    
}
