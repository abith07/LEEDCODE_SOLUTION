class Solution {
    public boolean detectCapitalUse(String word) {
        int cap=0;
        int small=0;
        int ff=0;
        char[]ww=word.toCharArray();
        int org=0;
        if(Character.isUpperCase(ww[0])){
            org++;

        }
        

        for(int i=0;i<ww.length;i++){


            if(Character.isUpperCase(ww[i])){
                cap++;
            }
            if(Character.isLowerCase(ww[i])){
                small++;

            }

           
        }
        if(cap==ww.length||small==ww.length||org==1 && small==ww.length-1){
            return true;
        }
        return false;

        
    }
}