public class FindUniquePaths {
    public static int uniquPaths ( int m, int n ){
        if ( m == 0 || n == 0){
            return 0;
        }

        int [][] dp = new int [m][n];

        for (int j = 0; j < n; j++){
            dp[0][j] = 1;
        }
        for (int i = 0; i < m; i++){
            dp[i][0] = 1;
        }  

        for ( int i = 1; i < dp.length; i++){
            for ( int j = 1; j < dp[i].length; j++ ){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[m-1][n-1];

    }

    public static void main ( String[] args){
        int [][] inputs = {
            {2,3},
            {6, 4},
            {0, 7},
            {3, 0},
            {5, 1},
            {8, 8},
            {10, 8}

        };

        for ( int i = 0; i < inputs.length; i ++){
            System.out.print((i+1) + ".\tRows = : " + inputs[i][0] + " Columns = : " + inputs[i][1]);
            System.out.println(" Number of Unique Paths = :   " + uniquPaths(inputs[i][0], inputs[i][1]) );
            System.out.println(new String (new char[100]).replace('\0', '-'));
        }
    }

}
