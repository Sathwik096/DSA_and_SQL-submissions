class Solution {
    private int search(int[] w , int m){
        int s = 0 , days = 0;
        for(int i=0;i<w.length;i++){
            if(s+w[i] > m){
                days++;
                s = w[i];
            }
            else
                s+=w[i];
        }
        return days+1;
    }
    public int shipWithinDays(int[] w, int days) {
        int l=0 , h=0 , m , count;
        for(int i=0;i<w.length;i++){
            if(w[i] > l)
               l = w[i];
            h += w[i];
        }
        while(l<=h){
            m = l + (h-l)/2;
            count = search(w,m);
            if(count <= days)
               h = m-1;
            else
               l = m+1;
        }
        return l;
    }
}