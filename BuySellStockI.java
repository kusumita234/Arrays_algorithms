import java.util.Arrays;

public class BuySellStockI {
    
    public static int maxProfit ( int [] prices){
        if ( prices == null || prices.length == 0) {
            return 0;
        }

        int min = prices[0];
        int maxProfit = 0;
        //System.out.println("Start min  =  " + min + " " + "maxProfit = " + maxProfit);

        for ( int i = 1; i < prices.length; i++){
            if ( prices[i]< min){
                min = prices[i];
                //System.out.println("Min is set for i  =  " + i + " " + min);
            } else {
                maxProfit = Math.max( maxProfit, prices[i] - min);
                //System.out.println("MaxProfit is set for i  =  " + i + " " + maxProfit);

            }
        }

        return maxProfit;
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
            System.out.print((i+1) + ".\tInput Price Lists: ");
            System.out.println(Arrays.toString(inputs[i]));

            System.out.println("\n\tMaximum Profit =  " +  maxProfit(inputs[i]));
            System.out.println(new String (new char[100]).replace('\0', '-'));
        }

    }
}
