package solution;
/*
 Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
 */
public class ReverseString {
	public String reverseString(String s) {
        // if(s == null || s.length()<=1 ) return s;
        // return reverseString(s.substring(1)) + s.charAt(0);
        char[] arr = s.toCharArray();
        char temp;
        for(int l=0,r=s.length()-1;l<r;l++,r--){
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
        }
        return new String(arr);
    }
}
