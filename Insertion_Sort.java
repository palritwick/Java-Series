public class Insertion_Sort {
    void insertionSort(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6 };
        Insertion_Sort ob = new Insertion_Sort();
        ob.insertionSort(arr);
        printArray(arr);
    }
}
