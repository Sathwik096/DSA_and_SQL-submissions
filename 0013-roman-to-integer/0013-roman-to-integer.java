class Solution {
    static void setMap(HashMap<Character,Integer> map){
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
    }
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        setMap(map);
        int res = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(i+1 < s.length()){
                if((s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X' ) && (s.charAt(i) == 'I')){
                    res -= map.get(s.charAt(i));
                    continue;
                }
                else if((s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C' ) && (s.charAt(i) == 'X')){
                    res -= map.get(s.charAt(i));
                    continue;}
                else if((s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M' ) && (s.charAt(i) == 'C')){
                    res -= map.get(s.charAt(i));
                    continue;}
            }
            res += map.get(s.charAt(i));
        }
        return res;
    }
}