import java.util.Arrays;

public class FindPeakElement {

    public static int findPeak ( int[] arr){

        if ( arr == null || arr.length == 0) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while ( start <=end){
            mid = (start + end) /2;

            if (mid == 0 || mid == arr.length -1 || (arr[mid]> arr[mid -1] && arr[mid]> arr[mid+1]) ){
                return arr[mid];
            }
            if ( arr[mid] < arr[mid+1]){
                start = mid +1;
            }else {
                end = mid;
            }
        }
        return arr[mid];
    }

    public static void main ( String[] args){
        int [][] inputs = {
            {9, 2, 3, 2, 6},
            {-5, -4, -4, 6, -1},
            {-1, -2, -3, -4, -2},
            {1, 3, 2, 9, 10},
            {-7, -8, -9, -2, -1},
            {10, 10, 10, 10, 10},
            {1, 2, 3, 4, 5},


        };

        for ( int i = 0; i < inputs.length; i ++){
            System.out.print((i+1) + ".\tInput Array: ");
            System.out.print(Arrays.toString(inputs[i])+ "  ");
            System.out.println("Peak Element  " + findPeak(inputs[i]) );
            System.out.println(new String (new char[100]).replace('\0', '-'));
        }
    }
    
}
