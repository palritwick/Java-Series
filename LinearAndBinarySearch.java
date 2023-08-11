
public class LinearAndBinarySearch {
    public static void LinearSearch(int arr[], int size, int el){
        for (int i = 0; i < size; i++) {
            if (arr[i] == el) {
                System.out.print(el+" is found at index "+i);
            }
        }
    }
    public static int BinarySearch(int arr[], int size, int el){
        int low,mid,high;
        low =0;
        high = size-1;
        while (low <= high) {
            mid = (low+high)/2;
            if (arr[mid] == el) {
                return mid;
            }
            else if(el < arr[mid]){
                high = mid-1;
            }
            else if(el > arr[mid]){
                low = mid +1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,6,8,9};
        int size = arr.length;
        int element = 8;
        // LinearSearch(arr, size, element);
        int res = BinarySearch(arr, size, element);
        System.out.println("Key element found at index "+res);
    }
}
