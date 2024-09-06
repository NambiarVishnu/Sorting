public class InsertionSort {
    public static int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;

        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 3, 2, 1, 4, 5 };

        int[] result = sort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }
}
