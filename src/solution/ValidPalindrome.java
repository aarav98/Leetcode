///*Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
//
//For example,
//"A man, a plan, a canal: Panama" is a palindrome.
//"race a car" is not a palindrome.
//
//Note:
//Have you consider that the string might be empty? This is a good question to ask during an interview.
//
//For the purpose of this problem, we define empty string as valid palindrome.
package solution;

import java.util.Stack;

public class ValidPalindrome {
	public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int len = s.length();
        
        if(len<2) return true;
        
        Stack<Character> stack = new Stack<Character>();
        int i = 0;
        while (i<len/2){
            stack.push(s.charAt(i));
            i++;
        }
        if(len%2 == 1) i++;
        
        while (i<len){
            if(stack.isEmpty()) return false;
            if(s.charAt(i) == stack.peek()) stack.pop();
            else return false;
            i++;
        }
        return true;
}
}
