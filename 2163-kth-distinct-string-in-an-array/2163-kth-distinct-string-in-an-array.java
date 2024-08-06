class Solution {
    public String kthDistinct(String[] arr, int k) {
        int dis = 0;
        
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            
            // Count occurrences of arr[i] in the array
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i].equals(arr[j])) {
                    sum++;
                    break; // No need to count further if duplicate found
                }
            }
            
            // If no duplicates found, increment distinct count
            if (sum == 0) {
                dis++;
                
                // Check if this is the k-th distinct element
                if (dis == k) {
                    return arr[i];
                }
            }
        }
        
        // If k-th distinct element is not found, return an empty string
        return "";
    }
}
