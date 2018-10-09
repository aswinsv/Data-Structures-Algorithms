class Solution {
    public String longestPalindrome(String s) {
        String max_subString=new String();
        int max_length=0;
        for(int i=0;i<s.length()-1;i++) {
            for(int j=i+1;j<s.length();j++) {
                String subString=s.substring(i,j+1);
                if(checkPalindrome(subString)) {
                    if(subString.length() > max_length) {
                         max_length=subString.length();
                         max_subString=subString;
                    }
                }
             }
         }
        return max_subString;
     }
    private boolean checkPalindrome(String s) {
        int startIndex=0;
        int endIndex=(s.length()-1);
        while(startIndex < endIndex) {
            if(s.charAt(startIndex)!=s.charAt(endIndex)) {
                return false;
            }
            startIndex++;
            endIndex--;
        }
        return true;
    }
}