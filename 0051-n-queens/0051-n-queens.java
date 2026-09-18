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
    static void solve(int col,List<List<String>> res,char[][] b,int n){
        if(col == n){
            List<String> ans = new ArrayList<>();
            for(int i=0;i<n;i++){
                ans.add(new String(b[i]));
            }
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int row = 0;row < n;row++){
            if(isSafe(row,col,b,n)){
                b[row][col] = 'Q';
                solve(col+1,res,b,n);
                b[row][col] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
       char[][] b = new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(b[i],'.');
        }
        solve(0,res,b,n);
        return res;
    }
}