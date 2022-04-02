package ss14.BaiTap;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {1,2, 5, 16, 3,47, 24,9,11,24};
        insertionSort(array);
    }
    public static void insertionSort(int array[]){
        for(int i=1; i<array.length; i++){
            int currentMin = array[i];
            for(int j=i-1; j > 0 && array[j] > currentMin; j--){
                array[j + 1] = array[j];
                array[j] = currentMin;
            }
        }
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
