package ss13.ThucHanh;

public class BinarySearch {
    static int[] array = {2, 3, 5, 6, 9, 10, 23, 45, 67, 78,109};
    //tim kiem nhi phan
    static int binarySearch(int[] array, int key){
        int low=0, high=array.length-1, mid=(low+high)/2;
        while(high >= low){
            if(key == array[mid]){
                return mid;
            }else if(key < array[mid]){
                high = mid-1;
            }else{
                low = mid+1;
            }
            mid=(low+high)/2;
        }
        return -1;
    }
    //tim kiem bang de quy
    static int recursiveSearch(int[] array, int low, int high, int key){
        int mid = (low+high)/2;
        if(key == array[mid]){
            return mid;
        }else if(key < array[mid]){
            return recursiveSearch(array, low, mid-1, key);
        }
        return recursiveSearch(array, mid+1, high, key);
    }
    public static void main(String[] args) {
        System.out.println("Vị trí của số 3: " + binarySearch(array, 3));
        System.out.println("Vị trí của số 67: " + recursiveSearch(array, 0, array.length, 67));
    }
}
