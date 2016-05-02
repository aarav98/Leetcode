/*
 * Given an integer, write a function to determine if it is a power of two.
 */
package solution;

public class PowerOfTwo {
	public boolean isPowerOfTwo(int n) {
        // if(n==0) return false;
        // while(n%2 == 0){
        //     n = n/2;
        // }
        // return (n==1)? true:false;
        
        if(n<=0) return false;
        while(n%2 == 0) n = n>>1;
        return (n==1)? true:false;
    }
}
