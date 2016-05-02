/*
 * Given an integer, write a function to determine if it is a power of three.
 */
package solution;

public class PowerOfThree {
	public boolean isPowerOfThree(int n) {
        
        return (Math.log10(n)/Math.log10(3)) %1 == 0;
    }
}
