class Solution {
    ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
       ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> mp = new HashMap<>();
        
        for (int it : arr) {
            if (!mp.containsKey(it)) {
                mp.put(it, 1);
                ans.add(it);
            }
        }
        return ans ;
}
}
