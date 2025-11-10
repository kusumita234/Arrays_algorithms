import java.util.Arrays;

public class SpiralMatrix {

    public static void printSpiralMatrix ( int[][] arr){
        if ( arr == null || arr.length ==0) {
            return;
        }
        int leftIndex = 0;
        int rightIndex = arr[0].length -1;
        int upIndex = 0;
        int downIndex = arr.length -1;
        int printCount = 0;
        int arraySize = (arr.length) * (arr[0].length);


        System.out.print(" [ ");

        while (printCount < arraySize){
            for ( int i = leftIndex; i <= rightIndex && printCount < arraySize; i++ ){
                System.out.print(" " + arr[upIndex][i] + " ");
                printCount++;

            }
            upIndex++;
            //System.out.print(" printCount=  " + printCount + " ");


            for ( int i = upIndex; i <= downIndex && printCount < arraySize; i++ ){
                System.out.print(" " + arr[i][rightIndex] + " ");
                printCount++;

            }

            rightIndex--;
            //System.out.print(" printCount=  " + printCount + " ");


            for ( int i = rightIndex; i >= leftIndex && printCount < arraySize; i-- ){
                System.out.print(" " + arr[downIndex][i] + " ");
                printCount++;

            }

            downIndex--;
            //System.out.print(" printCount=  " + printCount + " ");


            for ( int i = downIndex; i >= upIndex && printCount < arraySize; i-- ){
                System.out.print(" " + arr[i][leftIndex] + " ");
                printCount++;

            }

            leftIndex++;
            //System.out.print(" printCount=  " + printCount + " ");


        }
        System.out.println(" ] ");


    }
     public static void main ( String[] args){
        int [][] inputs = {
            {  10,   4,    6,  23,  7},
            {  -3,  20,   -1,   8,  2},
            {   2,  -5,   -4,  43,   2},
            {  -3,  -10, -19,  21, -17},
            {  25,  50,   75, 100, 400}
        };

        int [][] inputs2 = {
            {  10,   4,    6,  23,   7,   30},
            {  -3,  20,   -1,   8,   2,  -22},
            {   2,  -5,   -4,  43,   2,    1},
            {  -3,  -10, -19,  21, -17,   -9},
            {  25,  50,   75, 100, 400,    1}
        };
        
        int [][] inputs3 = {
            {  10,   4,    6,  23},
            {  -3,  20,   -1,   8},
            {   2,  -5,   -4,  43},
            {  -3,  -10, -19,  21},
            {  25,  50,   75, 100},
            {   7,   2,    2, -17}
        };

        //## Iteration 1: Same no of rows and columns##
        System.out.println("## Iteration 1: Same no of rows and columns##");
        System.out.println("Input Array: ");
        for ( int i = 0; i < inputs.length; i ++){
            System.out.println(Arrays.toString(inputs[i]));
        }           
        System.out.print("\nSpiral Array: ");
        printSpiralMatrix (inputs);
        System.out.println(new String (new char[100]).replace('\0', '-'));

        //## Iteration 2: no of rows less than no of columns## 
        System.out.println("## Iteration 2: no of rows less than no of columns##");
        System.out.println("Input Array: ");
        for ( int i = 0; i < inputs2.length; i ++){
            System.out.println(Arrays.toString(inputs2[i]));
        }           
        System.out.print("\nSpiral Array: ");
        printSpiralMatrix (inputs2);
        System.out.println(new String (new char[100]).replace('\0', '-'));

         //## Iteration 3: no of rows greater than no of columns##
        System.out.println("## Iteration 3: no of rows greater than no of columns##");
        System.out.println("Input Array: ");
        for ( int i = 0; i < inputs3.length; i ++){
            System.out.println(Arrays.toString(inputs3[i]));
        }           
        System.out.print("\nSpiral Array: ");
        printSpiralMatrix (inputs3);
        System.out.println(new String (new char[100]).replace('\0', '-'));

    }
    
}
