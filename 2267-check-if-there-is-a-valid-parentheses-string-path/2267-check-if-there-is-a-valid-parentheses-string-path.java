class Solution {
    private Boolean[][][] memo;
    boolean generate(int i,int j,int n,int m,char[][] grid,int count){
        count = grid[i][j]=='(' ? count+1 : count-1;
        if(count < 0)
            return false;
        if(i==n && j==m){
            return count == 0;
        }
        if(memo[i][j][count] != null)
            return memo[i][j][count];
        if((j+1)<=m)
            if(generate(i,j+1,n,m,grid,count) == true)
                return memo[i][j][count] = true;
        if((i+1)<=n)
            if(generate(i+1,j,n,m,grid,count) == true)
                return memo[i][j][count] = true;
        return memo[i][j][count]=false;
    }
    public boolean hasValidPath(char[][] grid) {
        int m = grid.length , n= grid[0].length;
        if((m + n-1)%2 == 1)
            return false;
        if(grid[0][0]==')' || grid[m-1][n-1]=='(')
            return false;
        memo = new Boolean[m][n][m+n];
        return generate(0,0,m-1,n-1,grid,0);
    }
}