class Solution {
    public String decodeMessage(String key, String message) {
        int count=0;
        char x='a';
        HashMap<Character,Character>hm=new HashMap<>();
        for(int i=0;i<key.length();i++){
            if(key.charAt(i)==' '){continue;}
           if(!hm.containsKey(key.charAt(i)))
           {
            hm.put(key.charAt(i),x);
            x++;
           }
        }
        String ans="";
        for(int i=0;i<message.length();i++)
        {
            if(message.charAt(i)==' ')
            {
                  ans+=" ";
            }
            else
            {
                ans+=hm.get(message.charAt(i));
            }
        }
        return ans;
    }
}