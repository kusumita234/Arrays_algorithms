import java.util.Arrays;

public class MinPathSum {
    public static int findMinSum (int [][] grid) {
        if ( grid == null || grid.length == 0 || grid[0].length == 0) {
            return -1;
        }

        int[][] dp = new int [grid.length ][grid[0].length];
        
        for ( int i = 0; i< dp.length; i++) {
            for ( int j = 0; j< dp[i].length; j++) {
                dp[i][j] += grid[i][j];
                if ( i > 0 && j >0) {
                    dp[i][j] += Math.min ( dp[i-1][j], dp[i][j-1]);
                } else if ( i > 0) {
                    dp[i][j] += dp[i-1][j];
                } else if ( j >0 ){
                    dp[i][j] += dp[i][j-1];

                }
                //System.out.print("   dp[ " + i + " ][" + j + " ] = " +  dp[i][j]);

            }
            //System.out.println();
        }
        return dp [dp.length-1][dp[0].length -1 ];
        
    }

    public static void main ( String[] args){
        int [][] inputs = {
            { 1,   2,   3,   0}, 
            { 2,   2,   3,   1},
            { 0,   2,   2,   0},
            { 3,   3,   3,   2}, 
            { 0,   2,   2,   1} 
        };

        // int [][] inputs = {
        //     { 1,   0,   1}, 
        //     { 2,   3,   1}
        // };

       // for ( int i = 0; i < inputs.length; i ++){
            System.out.print(".\tInput Array: ");
            System.out.println(Arrays.deepToString(inputs));
            System.out.println("\n\tMin Sum Path  " + findMinSum(inputs) );
            System.out.println(new String (new char[100]).replace('\0', '-'));
       // }

    }
}