/*
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 */
package solution;

import java.util.Arrays;

public class MergeTwoSortedArrays {
	
//	public static void main(String[] args){
//		int[] A = {1,2,3,0,0,0};
//		int[] B = {0,0,0};
//		merge(A,3,B,3);
//	}
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m+n-1, j= m-1, k=n-1;
        for(i=m+n-1; i>=0&&k>=0&&j>=0; i--){
            if(nums1[j] >= nums2[k]){
                nums1[i] = nums1[j];j--;
            } 
            else{
                nums1[i] = nums2[k];k--;
            } 
        }
        while(k>=0){
            nums1[i] = nums2[k];
            i--;k--;
        }
//        System.out.println(Arrays.toString(nums1));
    }
}
