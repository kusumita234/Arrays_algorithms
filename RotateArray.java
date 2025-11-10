import java.util.Arrays;

public class RotateArray {

    public static int[] rotateArray2 ( int [] arr, int k) {
        if ( arr == null || arr.length == 0) {
            return null;
        }

        k = k % arr.length;
        int [] copy = new int[arr.length];
        for ( int i = 0; i < arr.length; i++){
            copy[(i +k) % arr.length] = arr[i];
        }

        arr = Arrays.copyOf(copy, copy.length);
        return arr;

    }

    public static void reverseArray( int[]arr, int start, int end){
        if ( arr == null || arr.length == 0) {
            return;
        }
        while ( start <end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    public static int[] rotateArray ( int [] arr, int k) {
        if ( arr == null || arr.length == 0) {
            return null;
        }

        k = k % arr.length;

        reverseArray ( arr, 0, (arr.length -1) );
        reverseArray ( arr, 0, (k-1));
        reverseArray(arr, k, (arr.length -1) );

        return arr;
        
    }

    public static void main ( String[] args){
        int [][] inputs = {
            {10, 20, 30, 40, 50},
            {1, -2, 3, 4, 5},
            {-1, 90, -90, 4, 6},
            {3, 6, 9, -12},
            {-100, -200, -300}
        };
        int [] k = {3, 2, 6, 2, 1};

        for ( int i = 0; i < inputs.length; i ++){
            System.out.print((i+1) + ".\tInput Array: ");
            System.out.println(Arrays.toString(inputs[i]));
            System.out.println("\tk = " + k[i]);
            int [] rotatedArray = rotateArray( (inputs[i]), k[i]);
            //int [] rotatedArray = rotateArray2( (inputs[i]), k[i]);

            System.out.print("\n\tRotated Arrray: ");
            System.out.println(Arrays.toString(rotatedArray));
            System.out.println(new String (new char[100]).replace('\0', '-'));
        }

    }
    
}
