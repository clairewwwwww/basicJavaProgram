import java.util.Arrays;

public class BasicMathOperations {

    public static void main(String[] args) {
        int[] data = {3, 5, 1, 8, 4, 9, 2, 7, 6};
        int target = 4;

        // Product of Elements
        int productResult = calculateProductOfElements(data);
        System.out.println("Product of Elements: " + productResult);

        // Binary Search
        int binarySearchResult = binarySearch(data, target);
        if (binarySearchResult != -1) {
            System.out.println(target + " found at index: " + binarySearchResult);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }

    // Method to calculate the Product of Elements
    public static int calculateProductOfElements(int[] array) {
        int product = 1;
        for (int num : array) {
            product *= num;
        }
        return product;
    }

    // Method to perform Binary Search
    public static int binarySearch(int[] array, int target) {
        Arrays.sort(array);

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midValue = array[mid];

            if (midValue == target) {
                return mid; // Element found
            } else if (midValue < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // Element not found
    }
}
