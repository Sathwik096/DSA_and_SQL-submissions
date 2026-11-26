class Solution {
    public boolean canAliceWin(int n) {
        if(n<10)
            return false;
        int moves = 10 , player = 1;
        while(n > 0){
            if(n < moves && player == 1)
                return false;
            else if(n < moves && player!=1)
                return true;
            n = n- moves;
            moves--;
            player = player == 1 ? 0 : 1;
        }
        if(player == 0)
            return true;
        return false;
    }
}