public class BubbleSort {
    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
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