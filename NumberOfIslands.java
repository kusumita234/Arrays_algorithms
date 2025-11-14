import java.util.Arrays;

public class NumberOfIslands {
    
    public static int numIslands ( int [][] grid) {
        if( grid == null || grid.length == 0) {
            return 0;
        }

        int numberOfIslands = 0;
        for ( int i = 0; i <grid.length; i++ ){
          for ( int j = 0; j <grid[i].length; j++ ) {
             if (grid[i][j] == 1){
                numberOfIslands += dfs( grid, i, j);          
             }
            }  
        }
        return numberOfIslands;
    }
    public static int dfs (int [][] grid, int i, int j) {
        if ( i < 0 || i >= grid.length || j<0 || j >= grid[i].length|| grid[i][j] == 0) {
            return 0;
        } 
            grid[i][j] = 0;
            dfs( grid, i-1, j);
            dfs( grid, i+1, j);
            dfs( grid, i, j-1);
            dfs( grid, i, j+1 );
        return 1;

    }

    public static void main ( String[] args){
        int [][][] inputs = {
            {
                { 1,  0, 1, 0, 1},
                { 1,  1, 0, 0, 0},
                { 0,  1, 0, 1, 1}
            },
            {
                { 1,  1, 1, 1, 0},
                { 1,  1, 0, 1, 0},
                { 1,  1, 0, 0, 0},
                { 0,  0, 0, 0, 0},
            },
            {
                { 1,  1, 0, 0, 0},
                { 1,  1, 0, 0, 0},
                { 0,  0, 1, 0, 0},
                { 0,  0, 0, 1, 1},
            }

        };

        for ( int i = 0; i < inputs.length; i ++){
            System.out.print((i+1) + "\nInput Array: ");
            System.out.print(Arrays.deepToString(inputs[i]));
            System.out.println(" Number of Islands = " + numIslands(inputs[i]) );
            System.out.println(new String (new char[100]).replace('\0', '-'));
        }
    }

    
}
