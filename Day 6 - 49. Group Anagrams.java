// Link - 
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null) return new ArrayList();
        Map<String, List<String>> map = new HashMap();
        for(String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(s);
        }
         return new ArrayList<List<String>>(map.values());
    }
}