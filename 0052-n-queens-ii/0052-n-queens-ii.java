class Solution {
    static boolean isSafe(int row,int col,char[][] b,int n){
        int r = row , c = col;
        //upper diagonal
        while(r >= 0 && c >= 0){
            if(b[r][c] == 'Q') return false;
            r--;
            c--;
        }
        r = row;
        c = col;
        //horizontal
        while(c >= 0){
            if(b[r][c] == 'Q') return false;
            c--;
        }
        r = row;
        c = col;
        //lower diagonal
        while(r < n && c >= 0){
            if(b[r][c] == 'Q') return false;
            r++;
            c--;
        }
        return true;
    }
    static void solve(int col,char[][] b,int n,int[] a){
        if(col == n){
            a[0]++;
            return;
        }
        for(int row = 0;row < n;row++){
            if(isSafe(row,col,b,n)){
                b[row][col] = 'Q';
                solve(col+1,b,n,a);
                b[row][col] = '.';
            }
        }
    }
    public int totalNQueens(int n) {
        int[] a = new int[1];
        char[][] b = new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(b[i],'.');
        }
        solve(0,b,n,a);
        return a[0];
    }
}