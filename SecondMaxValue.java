import java.util.Arrays;

public class SecondMaxValue {

    public static int findSecondMaxValue ( int [] arr) {
        if( arr == null || arr.length == 0){
            return Integer.MIN_VALUE;
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for ( int i : arr){
            if (i > max) {
                secondMax = max;
                max =i;

            } else if ( i < max && i > secondMax) {
                secondMax = i;
            }
        }
        return secondMax;

    }

    public static void main ( String[] args){
        int [][] inputs = {
            {9, 2, 3, 6},
            {1, 2},
            {-2, 2},
            {-4, -1, -9, 1, -7},
            {25, 50, 75, 100, 100}
        };

        for ( int i = 0; i < inputs.length; i ++){
            System.out.print((i+1) + ".\tInput List: ");
            System.out.println(Arrays.toString(inputs[i]));

            int secondMax = findSecondMaxValue(inputs[i]);

            System.out.println("\n\tSecond max Value: " +  (secondMax != Integer.MIN_VALUE ? secondMax : "None"));
            System.out.println(new String (new char[100]).replace('\0', '-'));
        }

    }


    
}
