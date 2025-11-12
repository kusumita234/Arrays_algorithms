import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean findDuplicate ( int [] arr) {

        if ( arr == null || arr.length == 0){
            return false;
        }

        HashSet <Integer> set = new HashSet<>();

        for (int i : arr) {
            if( set.contains(i)){
                return true;
            } else {
                set.add(i);
            }
        }

        return false;

    }

    public static void main ( String[] args){
        int [][] inputs = {
            {9, 2, 3, 2, 6, 6},
            {-5, -4, -4, 6, -1},
            {-1, -2, -3, -4, -5},
            {1, 3, 2, 9},
            {-2, -2, -2, -2, -2}
        };

        for ( int i = 0; i < inputs.length; i ++){
            System.out.print((i+1) + ".\tInput Array: ");
            System.out.println(Arrays.toString(inputs[i]));
            System.out.println("\n\tDoes it contains Duplicate?  " + findDuplicate(inputs[i]) );
            System.out.println(new String (new char[100]).replace('\0', '-'));
        }

    }
    
    
}

