public class Insertion_Sort {
    public static void insertionort(int[] arr) {
        for(int i=0; i< arr.length-1; i++){
            int key = arr[i];
            int j= i-1;
            while (j>= 0 && key <arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,6,10,5,20,15};
        System.out.println(Arrays.toString(arr));
        insertionort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
