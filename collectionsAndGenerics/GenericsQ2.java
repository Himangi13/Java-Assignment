package sampleprograms;

public class GenericsQ2 {
	public static <T> T[] swap(T[] list, int firstPos, int secondPos) {
		if (firstPos < 0 || firstPos >= list.length || secondPos < 0 || secondPos >= list.length) {
			throw new IndexOutOfBoundsException("Index out of bounds");
		}

		T temp = list[firstPos];
		list[firstPos] = list[secondPos];
		list[secondPos] = temp;

		return list;
	}

	public static void main(String[] args) {

		Integer[] numbers = { 7, 4, 3, 6, 5 };
		swap(numbers, 1, 4);
		System.out.println("swapped array:");
		for (Integer num : numbers) {
			System.out.print(num + " ");
		}

	}
}