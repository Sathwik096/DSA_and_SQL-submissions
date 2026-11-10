class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top , down , left , right , i , j ;
        top = left = 0;
        down = matrix.length-1;
        right = matrix[0].length-1;
        System.out.println(top + " " + right + " " + down + " " + left);
        List<Integer> list = new ArrayList<>();
        while(left<=right && top<=down){
                //top
                for(j  = left ; j<=right ; j++){
                    list.add(matrix[top][j]);
                }
                top++;

                //right
                for(i = top ; i <= down ; i++){
                    list.add(matrix[i][right]);
                }
                right--;

                //down
                if(top <= down){
                for(j = right ; j >= left ; j--){
                    list.add(matrix[down][j]);
                }
                down--;
                }

                //left
                if(left <= right){
                for(i = down ; i >= top ; i--){
                    list.add(matrix[i][left]);
                }
                left++;
                }
        }

        return list;
    }
}