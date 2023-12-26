public class BinarySearch{
    public static int binarySearch(int[] arr,  int target) {
    int L = 0;
    int R = arr.length - 1;
    while(L <= R){
        int mid = L +(R - L)/2;
        if(target < arr[mid]){
            R = mid - 1;

        }
        else if(target > arr[mid]){
            L = mid + 1;
        }
        else return mid;
    }
    return -1;

}
}