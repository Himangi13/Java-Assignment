package assignment2;

public class SmallestNo {
	public static int findSmallest(int[] arr, int i) {
		if (i == 0) {
			return arr[i];
		}
		int currentElement = arr[i];
		int smallestInRest = findSmallest(arr, i - 1);
		return Math.min(currentElement, smallestInRest);
	}

	public static void main(String[] args) {
		int[] Arr = { 5, 3, 1, 7, 4, 2 };
		int smallestValue = findSmallest(Arr, Arr.length - 1);
		System.out.println("The smallest value in the array is: " + smallestValue);
	}
}