class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        int aliceSm = Integer.parseInt(arriveAlice.substring(0,2));
        int aliceLm = Integer.parseInt(leaveAlice.substring(0,2));
        int aliceSd = Integer.parseInt(arriveAlice.substring(3,5));
        int aliceEd = Integer.parseInt(leaveAlice.substring(3,5));
        int bobSm = Integer.parseInt(arriveBob.substring(0,2));
        int bobLm = Integer.parseInt(leaveBob.substring(0,2));
        int bobSd = Integer.parseInt(arriveBob.substring(3,5));
        int bobEd = Integer.parseInt(leaveBob.substring(3,5));

        int aliceStart = 0 ;
        for(int i=0;i<aliceSm-1;i++)
            aliceStart += days[i];
        aliceStart += aliceSd;

        int aliceLeave = 0;
        for(int i=0;i<aliceLm-1;i++)
            aliceLeave += days[i];
        aliceLeave += aliceEd;

        int bobStart = 0;
        for(int i=0;i<bobSm-1;i++)
            bobStart += days[i];
        bobStart += bobSd;

        int bobLeave = 0;
        for(int i=0;i<bobLm-1;i++)
            bobLeave += days[i];
        bobLeave += bobEd;

        int count = 0;
        //78   79  80  81
        if(bobStart >= aliceStart && bobStart <= aliceLeave){
            if(bobLeave <= aliceLeave)
                count = bobLeave - bobStart + 1;
            else
                count = aliceLeave - bobStart + 1;
        }
        else if(bobStart < aliceStart && aliceStart <= bobLeave){
            if(aliceLeave <= bobLeave)
                count = aliceLeave - aliceStart + 1;
            else
                count = bobLeave - aliceStart + 1;
        }
        return count ;
    }
}