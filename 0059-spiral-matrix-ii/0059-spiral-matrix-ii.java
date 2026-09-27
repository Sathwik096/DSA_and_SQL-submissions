class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int top , down , left , right , i , j , dir;
        top = left = dir = 0;
        down = right = n-1;
        int ele = 1;
        while( top<=down && left<=right){
           
                //top
                for(j  = left ; j<=right ; j++){
                    mat[top][j] = ele;
                    ele++;
                }
                top++;
                //right
                for(i = top ; i <= down ; i++){
                    mat[i][right] = ele;
                    ele++;
                }
                right--;
            
                //down
                if(top <= down){
                for(j = right ; j >= left ; j--){
                    mat[down][j] = ele;
                    ele++;
                }
                down--;
                }
            
                //left
                if(left <= right){
                for(i = down ; i >= top ; i--){
                    mat[i][left] = ele;
                    ele++;
                }
                left++;
                }
            
        }
        return mat;
    }
}