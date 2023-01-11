package javachallenge;
public class ChallengeThree {

	public static void main(String[] args) {
		
		String s= "A man, a plan, a canal: Panama";
		String rev="";
		String s1 = s.replaceAll("[^a-zA-Z0-9]", "");
		int len = s1.length();
		char[] charArray = s1.toCharArray();
		
		for (int i = charArray.length-1; i >=0; i--) {
			rev=rev+charArray[i];
		}
		
		if(rev.equalsIgnoreCase(s1)) {
			System.out.println(s1 + " is a Palindrome");
		}
		
		else {
			System.out.println("Its not a Palindrome");
		}
	}
}

/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and 
removing all non-alphanumeric characters, it reads the same forward and backward. 
Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Example 3:
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
*/