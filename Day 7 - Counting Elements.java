// Link - 
class Solution {
    public int countElements(int[] arr) {
     int count = 0;
        Set<Integer> s = new HashSet();
        for(int i=0;i<arr.length;i++) {
            s.add(arr[i]);    
        }
        
        for(int i=0;i<arr.length;i++) {
            if(s.contains(arr[i]+1)) count++;
        }
        
        return count;
        
        
    }
}