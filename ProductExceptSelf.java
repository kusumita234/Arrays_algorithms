import java.util.Arrays;
import java.util.Collections;

public class ProductExceptSelf {

    public static int[] findProduct (int [] arr){

        if( arr == null || arr.length == 0) {
            return null;
        }

        int [] product = new int[arr.length];
        int left =1;

        for ( int i =0; i < arr.length; i++){
            product[i] = left;
            left *= arr[i];
        }

        int right =1;

        for ( int i =arr.length -1; i >= 0; i--){
            product[i] *= right;
            right *= arr[i];
        }


        return product;
    }

    public static void main ( String[] args){
        int [][] input = {
            {1,2,3,4},
            {5, -3, 1, 2},
            {2,2,2,0},
            {0,0,0,0},
            {-1, -2, -4}
        };

        for ( int i =0; i< input.length; i++){
            System.out.println((i+ 1) + ".\tInput Array: " + Arrays.toString( input[i]) );
            System.out.println( " \tOutput Product: " + Arrays.toString( findProduct(input[i])) );
            System.out.println('-' + String.join("", Collections.nCopies(100, "-")));

        }

    }

    
}
