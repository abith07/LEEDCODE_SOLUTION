class Solution {
     public void reverse(int []arr){
            int s=0;
            int e=arr.length-1;
            while(s<e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
     }
    public void rotate(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<=m-2;i++){
            for(int j=i+1;j<=n-1;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<=m-1;i++){
            reverse(matrix[i]);
        }
       
        }
        
    }