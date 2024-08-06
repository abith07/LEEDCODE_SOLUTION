class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length-1;i++){
             StringBuilder ss= new StringBuilder(words[i]);
        ss.reverse();
            for(int j=i+1;j<words.length;j++)

        
       
        if(ss.toString().equals(words[j])){
            count++;

        }
        }
        return count;

        
    }
}