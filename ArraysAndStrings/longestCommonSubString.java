public class longestCommonSubString
{
	public String getLongestSubString(String s1,String s2) {

		int[][] LCS=new int[s1.length()+1][s2.length()+1];

		StringBuilder subString=new StringBuilder();

		int max_length=0;

		for(int i=1;i<s1.length();i++) {
			for(int j=1;j<s2.length();j++) {
				if(i==0 || j==0) {
					LCS[i][j]=0;
				}
				else if(s1.charAt(i-1)==s2.charAt(j-1)) {
					LCS[i][j]=(LCS[i-1][j-1]+1);
					if(LCS[i][j] > max_length) {
						subString.append(s1.charAt(i-1));
						max_length=LCS[i][j];
					}
				}
				else {
					LCS[i][j]=0;
				}
			}
		}
		return subString.toString();

	}
	public static void main(String[] args) {

		longestCommonSubString l1=new longestCommonSubString();

		String s1="tutorialhorizon";

		String s2="dynamictutorialProgramming";

		System.out.println("Common substring:"+l1.getLongestSubString(s1,s2));

	}
}