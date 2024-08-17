class Solution {
    public String shortestPalindrome(String s) {
        if(s.length()==0||s.length()==1){
            return s;
        }
        char[] ch = s.toCharArray();

        StringBuilder find = new StringBuilder();
        char a = ch[0];
        int i;

        for (i = ch.length - 1; i >= 0; i--) {
            if (a == ch[i]) {
                if (isPal(s.substring(0, i + 1))) {
                    break;
                }
            }
        }

        for (int j = ch.length - 1; j > i; j--) {
            find.append(ch[j]);
        }

        return find.toString() + s;
    }

    public boolean isPal(String str) {
        int s = 0, e = str.length() - 1;
        while (s < e) {
            if (str.charAt(s) != str.charAt(e)) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}
