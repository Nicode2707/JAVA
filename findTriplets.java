class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        int size = arr.length;
        List<List<Integer>> out = new ArrayList<>();
        Map<Integer, List<Integer>> u = new HashMap<>();
        
        for (int i = 0; i < size; i++) {
            u.computeIfAbsent(arr[i], k -> new ArrayList<>()).add(i);
        }
        
        for (int i = 0; i < size - 2; i++) {
            for (int j = i + 1; j < size - 1; j++) {
                int key = -(arr[i] + arr[j]);
                if (u.containsKey(key)) {
                    for (int n : u.get(key)) {
                        if (n > j) {
                            out.add(Arrays.asList(arr[i], arr[j], arr[n]));
                        }
                    }
                }
            }
        }
        
        return out;
    }
