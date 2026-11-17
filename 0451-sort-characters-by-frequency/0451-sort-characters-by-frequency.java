class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Map.Entry<Character,Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(Map.Entry.<Character,Integer>comparingByValue().reversed());

        Map<Character,Integer> linkedMap = new LinkedHashMap<>();
        for(Map.Entry<Character,Integer> entry : entryList){
            linkedMap.put(entry.getKey() , entry.getValue());
        }
        StringBuilder sb = new StringBuilder();
        System.out.println(linkedMap);
        for(Map.Entry<Character,Integer> entry : linkedMap.entrySet()){
            int val = entry.getValue();
            char ch = entry.getKey();
            for(int i = 0 ; i < val ; i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}