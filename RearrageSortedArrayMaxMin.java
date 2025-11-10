import java.util.Arrays;

public class RearrageSortedArrayMaxMin {
     
    public static void rearrageSortedArray ( int [] arr) {
        if( arr == null || arr.length == 0) {
            return ;
        }

        int largeNumber = arr[arr.length -1 ] +1;
        int maxIndex = arr.length - 1;
        int minIndex = 0;

        for ( int i =0; i < arr.length; i++){
            if ( i %2 == 0) {
                arr[i] = arr[i] + (arr[maxIndex] % largeNumber) * largeNumber;
                maxIndex--;

            } else {
                // if ( i == 3 ||  i == 7){
                //     System.out.println("Before change i = " + i + " arr[i] = " + arr[i]);
                //     System.out.println("Before change i = "+ i + " arr[i] = " + arr[i] + " minIndex = " + minIndex +" arr[minIndex]  = " + arr[minIndex] );

                // }

                arr[i] = arr[i] + (arr[minIndex] % largeNumber) * largeNumber;
                
                // if ( i == 3 ||  i == 7){
                //     System.out.println("After change i = " + i + " arr[i] = " + arr[i]);

                // }

                minIndex++;

            }

        }

        for ( int i =0; i < arr.length; i++){
            arr[i] = arr[i] / largeNumber;
        }
   
  
    }
public static void main ( String[] args){
        int [][] inputs = {
            {1, 2, 3, 4, 5, 6, 7, 8},
            {11, 22, 33, 44, 55, 66, 77, 88},
            {1, 2, 4, 8, 16, 32, 64, 128, 512, 1024},
            {3, 3, 5, 5, 7, 7, 9, 9, 11, 11, 13, 13},
            {100, 233, 544, 753, 864, 935, 1933, 2342}
        };

        for ( int i = 0; i < inputs.length; i ++){
            System.out.print((i+1) + ".\tInput Array: ");
            System.out.println(Arrays.toString(inputs[i]));

            // int [] sortedArray  = rearrageSortedArray(inputs[i]);
            rearrageSortedArray(inputs[i]);

            System.out.println("\n\tSorted Array: " + Arrays.toString(inputs[i]) );
            System.out.println(new String (new char[100]).replace('\0', '-'));
        }

    }



}