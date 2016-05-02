/*
 * Write a program to check whether a given number is an ugly number.

Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.

Note that 1 is typically treated as an ugly number.
 */
package solution;

public class UglyNumber {
	public boolean isUgly(int num) {
        if (num<1) return false;
        num = maxDivide(num,2);
        num = maxDivide(num,3);
        num = maxDivide(num,5);
        return (num == 1)? true:false;
    }
    
    int maxDivide(int a, int b){
        while(a%b == 0){
            a = a/b;
        }
        return a;
    }
}
