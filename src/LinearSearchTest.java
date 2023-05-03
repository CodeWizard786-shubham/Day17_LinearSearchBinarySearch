public class LinearSearchTest {
    public static void linearSearch(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5) {
                System.out.println("Element Found");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        linearSearch(arr);
        }
    }
