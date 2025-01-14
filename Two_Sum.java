  
/*
1. Two Sum
Easy
Topics
Companies
Hint
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
*/

import java.util.HashMap;

public class Two_Sum {
	public  int[] twoSum(int[] nums, int target) {
		// Create a HashMap to store numbers and their indices
		HashMap<Integer, Integer> map = new HashMap<>();

		// Loop through the array
		for (int i = 0; i < nums.length; i++) {
			// Calculate the remain that would sum to the target
			int remain = target - nums[i]; 

			// Check if the remain exists in the map
			if (map.containsKey(remain)) {
				// If found, return the indices
				return new int[] { map.get(remain), i };
			}

			// Otherwise, add the current number and its index to the map
			map.put(nums[i], i);
		}

		// Return an empty array if no solution is found (this line is not reached in
		// valid input)
		return new int[] {};
	}

	public static void main(String[] args) {
		Two_Sum ts = new Two_Sum();

		// Test Example 1
		int[] nums1 = { 2, 7, 11, 15 };
		int target1 = 9;
		int[] result1 = ts.twoSum(nums1, target1);
		System.out.println("Indices: [" + result1[0] + ", " + result1[1] + "]");

		// Test Example 2
		int[] nums2 = { 3, 2, 4 };
		int target2 = 6;
		int[] result2 = ts.twoSum(nums2, target2);
		System.out.println("Indices: [" + result2[0] + ", " + result2[1] + "]");

		// Test Example 3
		int[] nums3 = { 3, 3 };
		int target3 = 6;
		int[] result3 = ts.twoSum(nums3, target3);
		System.out.println("Indices: [" + result3[0] + ", " + result3[1] + "]");
	}
}
