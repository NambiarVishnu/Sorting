public class SelectionSort {
    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            selectionSwap(arr, minIndex, i);
        }
        return arr;
    }

    private static void selectionSwap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 3, 2, 1, 4, 5 };

        int[] result = sort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }
}
