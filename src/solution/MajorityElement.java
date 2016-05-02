/*
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
 * 
 */
package solution;

import java.util.Arrays;

public class MajorityElement {
	 public int majorityElement(int[] nums) {
	        Arrays.sort(nums);
	        int count = 1;
	        for(int i = 1; i< nums.length; i++){
	            if(nums[i] == nums[i-1]) {
	                count++;
	                if(count > Math.floor(nums.length/2)) return nums[i];
	            }else count = 1;
	        }
	        return nums[0];
	    }
}
