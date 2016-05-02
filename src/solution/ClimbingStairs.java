/*
 * You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?


 */
package solution;

import java.util.Arrays;

public class ClimbingStairs {
	public int climbStairs(int n) {
        int [] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return countWays( n, memo);
    }
    
    public int countWays(int n, int [] memo){
        if(n<0) return 0;
        else if (n==0) return 1;
        else if (memo[n] > -1) return memo[n];
        else{
            memo[n] = countWays(n-1,memo) + countWays(n-2, memo);
            return memo[n];
        }
    }
}
