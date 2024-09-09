package java8features;

@FunctionalInterface
interface SecondSmallestInterface {
	int secondSmallest(int[] arr);
}

public class SecondSmallestEx {
	int findSecondSmallest(int a[]) {
		SecondSmallestInterface ssi = (arr) -> {
			if (arr.length < 2) {
				return -1;// Not enough elements for a second smallest number
			}
			int smallest = Integer.MAX_VALUE;
			int secondSmallest = Integer.MAX_VALUE;
			for (int num : arr) {
				if (num < smallest) {
					secondSmallest = smallest;
					smallest = num;
				} else if (num < secondSmallest && num != smallest) {
					secondSmallest = num;
				}
			}
			return secondSmallest == Integer.MAX_VALUE ? -1 : secondSmallest;
		};
		return ssi.secondSmallest(a);
	}

	public static void main(String[] args) {
		/*
		 * class definitions: class Source: visibility: public method definitons:
		 * getSecondSmallest(int []arr): return type: int visibility: public
		 */
		SecondSmallestEx secondSmallestEx = new SecondSmallestEx();
		int[] arr = { 12, 13, 11, 10, 34, 15 };
		int result = secondSmallestEx.findSecondSmallest(arr);
		if (result != -1) {
			System.out.println("The second smallest number is: " + result);
		} else {
			System.out.println("There is no second smallest number.");
		}

	}

}
