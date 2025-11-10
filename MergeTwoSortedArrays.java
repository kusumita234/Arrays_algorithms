import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static ArrayList<Integer> mergedArray ( ArrayList<Integer> arr1, ArrayList<Integer> arr2 ){
        if(arr1 == null || arr2.size() == 0 ){
            return arr2;
        }
          if(arr2 == null || arr2.size() ==0 ){
            return arr1;
        }

        int index1 =0;
        int index2 =0;

        while (index1 < arr1.size() && index2 < arr2.size()){
            if (arr1.get(index1) <= arr2.get(index2) ) {
                index1++;
            } else{
                arr1.add(index1, arr2.get(index2));
                index1++;
                index2++;

            }
        }

            while (index2 < arr2.size()){
                arr1.add(arr2.get(index2++));

            }
    

        return arr1;
    }

    public static void main ( String[] args){
        ArrayList<ArrayList<Integer>> nums1 = new ArrayList<>();
        nums1.add(new ArrayList<>(Arrays.asList(23, 33, 35, 41, 44, 47, 56, 91, 105)));
        nums1.add(new ArrayList<>(Arrays.asList(1,2)));
        nums1.add(new ArrayList<>(Arrays.asList(1,1,1)));
        nums1.add(new ArrayList<>(Arrays.asList(6)));
        nums1.add(new ArrayList<>(Arrays.asList(12, 34, 45, 56, 67, 78, 89, 99)));

        ArrayList<ArrayList<Integer>> nums2= new ArrayList<>();
        nums2.add(new ArrayList<>(Arrays.asList(32, 49, 50, 51, 61, 99)));
        nums2.add(new ArrayList<>(Arrays.asList(7)));
        nums2.add(new ArrayList<>(Arrays.asList(1,2,3,4)));
        nums2.add(new ArrayList<>(Arrays.asList(-99, -45)));
        nums2.add(new ArrayList<>(Arrays.asList(100)));


        for( int i=0; i < nums1.size(); i++){
            System.out.println((i + 1) + ".\tFirst Array: " + nums1.get(i));
            System.out.println("\tSecond Array: " + nums2.get(i));

            ArrayList<Integer>  mergedArray = mergedArray( nums1.get(i), nums2.get(i));
            //ArrayList<Integer>  mergedArray = mergedArray( new ArrayList<Integer>(nums1.get(i)), new ArrayList<Integer>(nums2.get(i)));
            System.out.println("\tMerged Array: " + mergedArray);
            System.out.println(new String(new char[100]).replace('\0', '-'));

        }


    }

    
}
