
/*
Date:- 10/09/2024 

1.Missing Number
Given an array nums containing n distinct numbers in the 
range [0, n], return the only number in the range that is 
missing from the array.

Example 1:
 Input: nums = [3,0,1]
 Output: 2
 Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
 2 is the missing number in the range since it does not appear in nums.
 
 Example 2:
 Input: nums = [0,1]
 Output: 2
 Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2].
 2 is the missing number in the range since it does not appear in nums.

 Example 3:
 Input: nums = [9,6,4,2,3,5,7,0,1]
 Output: 8
 Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
 
 */


public class MissingNumber extends Exception  {

	public static void main(String[] args) {
		
		int arr[]= {3,0,1};
		System.out.println(MissingNumber(arr));

		 int arr2[] = {0,1};
          System.out.println(MissingNumber(arr2));
		 
          int arr3[] = {0,1,3,2,5};  
          System.out.println(MissingNumber(arr3));
          
         int arr4[] = {9,6,4,2,3,5,7,0,1};//37
         System.out.println(MissingNumber(arr4));
          
		
	}
	
	public static int MissingNumber(int nums[]) {
		
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
 			sum += nums[i];
		}

		int actualsum = (nums.length * (nums.length + 1))/2;
		int missingnumber = actualsum - sum;

		return missingnumber;
		
	}

}

 /*
  * i am using the method find missing number in array is 
  * 
  *  missingNumber= actualSum-sum
  *  
  *  
  *  first we wan to find actual sum 
  * 
  *  actualSum = n.length(n.length+1)/2
  *  
  * */
