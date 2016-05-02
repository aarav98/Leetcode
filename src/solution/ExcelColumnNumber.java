/*
 * Related to question Excel Sheet Column Title

Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 

 */
package solution;

public class ExcelColumnNumber {
	public int titleToNumber(String s) {
        int result = 0;
        
        int i = s.length()-1;
        int t = 0;
        while(i>=0){
            result += (int) Math.pow(26,t) *(s.charAt(i) - 'A'+1);
            t++;
            i--;
        }
        return result;
    }
}
