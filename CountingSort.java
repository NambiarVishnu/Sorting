public class CountingSort {
    public static int[] sort(int[] arr, int max) {
        int[] count = new int[max + 1];
        for (int item : arr)
            count[item]++;

        int k = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[k++] = i;
            }

        }
        return arr;

    }

    public static void main(String[] args) {
        int arr[] = { 7, 3, 2, 1, 4, 5 };

        int finalResult[] = sort(arr, 7);
        for (int z = 0; z < finalResult.length; z++) {
            System.out.print(finalResult[z]);
        }

    }
}
