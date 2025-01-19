// for checking array is sorted or not
public class Practice_7 {
    public static void main(String[] args) {
        int[] a = {97, 56, 67, 92}; // Sample array

        boolean isSorted = true; // Assume array is sorted initially

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) { // Check for ascending order
                isSorted = false; // Mark as unsorted if a pair is found in the wrong order
                break; // Exit the loop early since the array is not sorted
            }
        }

        if (isSorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}