class Solution {
    public boolean isPalindrome(String s) {
        ArrayList<Character>org=new ArrayList<>();
        ArrayList<Character>rev=new ArrayList<>();
        String st=s.toLowerCase();
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)>='a'&&st.charAt(i)<='z'||st.charAt(i)>='0'&&st.charAt(i)<='9'){
            org.add(st.charAt(i));
            }
        }
        for(int i=st.length()-1;i>=0;i--){
            if(st.charAt(i)>='a'&&st.charAt(i)<='z'||st.charAt(i)>='0'&&st.charAt(i)<='9'){
            rev.add(st.charAt(i));
            }
        }
        if(org.equals(rev)){
            return true;
        
            }
            return false;
        }
}

        
        
        
    
