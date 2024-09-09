package java8features;
@FunctionalInterface
interface SecondLargestInterface {
    int secondLargest(int[] arr);
}
public class SecondLargestEx {
	int findSecondLargest(int a[]) {
        SecondLargestInterface sli = (arr) -> {
            if (arr.length < 2) {
                return -1; // Not enough elements for a second largest number
            }
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;
            for (int num : arr) {
                if (num > largest) {
                    secondLargest = largest;
                    largest = num;
                } else if (num > secondLargest && num != largest) {
                    secondLargest = num;
                }
            }
            return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
        };
        return sli.secondLargest(a);
    }

	public static void main(String[] args) {
		SecondLargestEx secondLargestEx = new SecondLargestEx();
        int[] arr = {12, 13, 11, 10, 34, 15};
        int result = secondLargestEx.findSecondLargest(arr);
        if (result != -1) {
            System.out.println("The second largest number is: " + result);
        } else {
            System.out.println("There is no second largest number.");
        }

	}

}
