import java.util.Arrays;

public class RearrageNegativePositiveValues {

    public static void rearrage ( int [] arr){

        if( arr == null || arr.length == 0) {
            return;
        }

        int index = -1;

        for( int i = 0; i < arr.length; i++ ){
            if (arr[i] < 0 && index != -1 ) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index++] = temp;
            } else if (arr[i] > 0 && index == -1 ) {
                index = i;
            }

        }

    }

    public static void main ( String[] args){
        int [][] inputs = {
            {10, 4, 6, 23, 7},
            {-3, 20, -1, 8},
            {2, -5, -4, 43, 2},
            {-3, -10, -19, 21, -17},
            {25, 50, 75, 100, 400}
        };

        for ( int i = 0; i < inputs.length; i ++){
            System.out.print((i+1) + ".\tInput Array: ");
            System.out.println(Arrays.toString(inputs[i]));
            rearrage ( inputs[i]);

            System.out.print("\n\tResult Array: ");
            System.out.println(Arrays.toString(inputs[i]));
            System.out.println(new String (new char[100]).replace('\0', '-'));
        } 


    }
    
}

