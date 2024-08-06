class Solution {
    public String kthDistinct(String[] arr, int k) {
        
        int dis=0;
        String as="";
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr.length;j++){
                if(i!=j&&arr[i].equals(arr[j])){
                sum++;
                break;
            }
            }
            if(sum==0){
                dis++;
                if(dis==k){
                    return arr[i];
                }

            }
            
            
        }
        
            return as;
        
        
    }
}