class Solution {

    boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        int d=0;
        int sum=x;
    
        
        while(x!=0){
            int c=x%10;
             d=d*10+c;
            x=x/10;

        }
        if(d==sum){
            return true;
        }
        else{
           return false;
        }
        
    }
   

    }
