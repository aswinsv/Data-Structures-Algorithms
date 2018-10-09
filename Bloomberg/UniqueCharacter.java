class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> characterCountMap=new LinkedHashMap<Character,Integer>();
        if(s==null)
            return -1;
        Character[] characters=new Character[s.length()];
        for(int i=0;i<s.length();i++) {
            characters[i]=new Character(s.charAt(i));
        }
        List<Character> characterList=new ArrayList<Character>(Arrays.asList(characters));
        for(char c:characterList) {
            if(characterCountMap.containsKey(c)) {
                characterCountMap.put(c,characterCountMap.get(c)+1);
            }
            else {
                characterCountMap.put(c,1);
            }
        }
        for(char c:characterCountMap.keySet()) {
            if(characterCountMap.get(c)==1) {
                return characterList.indexOf(c);
            }
        }
        return -1;
    }
}