class Solution {
    public boolean isValid(String s) {
        char[] charArray=s.toCharArray();
        Stack<Character> st=new Stack<Character>();
        for(char c:charArray) {
            if(c=='{' || c=='(' || c=='[') {
                st.push(c);
            }
            else if(c=='}') {
                if(!st.empty()) {
                char topElement=(char) st.peek();
                if(topElement=='{') {
                    st.pop();
                 }
                 else {
                    return false;
                 }
              }
                else {
                return false;
                }    
            }
            else if(c==')') {
                if(!st.empty()) {
                char topElement=(char) st.peek();
                if(topElement=='(') {
                    st.pop();
                }
                else {
                    return false;
                }
               }  
                else {
                return false;
                }   
            }
             else if(c==']') {
                if(!st.empty()) { 
                char topElement=(char) st.peek();
                if(topElement=='[') {
                    st.pop();
                }
                else {
                    return false;
                }
               } 
                else {
                return false;
                }   
            }
        }
        if(st.empty()) {
            return true;
        }
        return false;
    }
}