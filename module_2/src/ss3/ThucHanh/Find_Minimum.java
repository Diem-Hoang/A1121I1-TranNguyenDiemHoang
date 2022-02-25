package ss3.ThucHanh;

public class Find_Minimum {
    public static void main(String[] args) {
        int[] arr = {2, 66, 24, 67, 18, 96, 109, 35, 78};
        int count = gtnn(arr);
        System.out.println("Giá trị phẩn tử nhỏ nhất trong mảng là: " + arr[count]);
    }

    public static int gtnn(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
