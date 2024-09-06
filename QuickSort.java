public class QuickSort {
    public static void sort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int boundary = partition(arr, start, end);
        sort(arr, start, boundary - 1);
        sort(arr, boundary + 1, end);

    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = end;
        int boundary = start - 1;
        for (int i = start; i <= end; i++) {
            if (arr[i] <= pivot) {
                boundary++;
                swap(arr, i, boundary);
            }
        }
        return boundary;
    }

    private static void swap(int arr[], int index1, int index2) {
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
