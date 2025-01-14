
import java.util.HashSet;
import java.util.Scanner;

public class ArrayDuplicate {
 
	// find the duplicate element array
	public static void main(String[] args) {
		int arr[] = { 12, 34, 56, 34, 12 };
		findDuplicates(arr);
	}

	public static void findDuplicates(int[] arr) {
		HashSet<Integer> seen = new HashSet<>();
		HashSet<Integer> duplicates = new HashSet<>();

		for (int num : arr) {
			if (!seen.add(num)) {// this logic used to defined if element not seen add it
				duplicates.add(num);// if seen print in duplicate
			}
		}
		System.out.println("Duplicate elements: " + duplicates);
	}
}
