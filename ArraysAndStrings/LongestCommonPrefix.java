class Solution {
    public String longestCommonPrefix(String[] strs) {
        List<String> subStringList=new ArrayList<String>();
        if(strs.length==0 || strs[0].length()==0) {
            return "";
        }
        else if(strs.length==1) {
            return strs[0];
        }
        
        String subString=new String();
        for(int i=1;i<=strs[0].length();i++) {
            subString=strs[0].substring(0,i);
            subStringList.add(subString);
        }
        CharSequence[] cs=subStringList.toArray(new CharSequence[subStringList.size()]);
        boolean presentInList=false;
        for(int j=cs.length-1;j>=0;j--) {
            presentInList=false;
            for(int i=1;i<strs.length;i++) {
               if(cs[j].length() <= strs[i].length()) { 
               if(strs[i].substring(0,cs[j].length()).equals(cs[j].toString())) {
                    presentInList=true;
                }
                else {
                    presentInList=false;
                    break;
                } 
              }
            else {
             presentInList=false;   
             break;   
             }
            }
            if(presentInList) {
                return cs[j].toString();
            }
        }
       return "";
        
    }
}