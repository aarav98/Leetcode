/*
 * Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.
 */
package solution;

import java.util.Arrays;

public class ValidAnagram {
public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) return false;
        
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        Arrays.sort(sarr);
        Arrays.sort(tarr);
        return Arrays.equals(tarr,sarr);
    }
}
