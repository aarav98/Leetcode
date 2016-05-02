//Determine whether an integer is a palindrome. Do this without extra space.
package solution;

public class PalindromeNumber {
	public boolean isPalindrome(int x) {
        //## reverse integer could over flow
        int rev = 0;
        int y = x;
        while(x!=0) {rev = rev*10 + x%10; x/=10;}
        return (y==rev && y>=0)? true:false;
        
    }
}
