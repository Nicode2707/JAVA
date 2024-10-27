class Solution {
    public boolean findTriplet(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] == arr[k]) {
                        return true;
                    }
                }
            }
        }
        return false;
    
        
    }
}
