public class Solution {
    public String reverseWords(String s) {
        String[] words=s.trim().split("\\s+");
        StringBuilder reversedString=new StringBuilder();
        if(words.length >=1) {
            reversedString.append(words[words.length-1]);
        }    
        for(int i=words.length-2;i>=0;i--) {
            reversedString.append(" ");
            reversedString.append(words[i]);
        }
        return reversedString.toString();
    }
}