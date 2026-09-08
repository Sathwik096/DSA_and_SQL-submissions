class Solution {
    static void comb(String s,int i,HashMap<Character,List<Character>> map,List<String> res,String cur){
        if(cur.length() == s.length()){
            res.add(cur);
            return;
        }
        for(int idx=0;idx<map.get(s.charAt(i)).size();idx++){
            comb(s,i+1,map,res,cur + (map.get(s.charAt(i)).get(idx)));
        }
    }
    public List<String> letterCombinations(String digits) {
        HashMap<Character,List<Character>> map = new HashMap<>();
        map.put('2',List.of('a','b','c'));
        map.put('3',List.of('d','e','f'));
        map.put('4',List.of('g','h','i'));
        map.put('5',List.of('j','k','l'));
        map.put('6',List.of('m','n','o'));
        map.put('7',List.of('p','q','r','s'));
        map.put('8',List.of('t','u','v'));
        map.put('9',List.of('w','x','y','z'));
        List<String> res = new ArrayList<>();
        comb(digits,0,map,res,"");
        return res;
    }
}