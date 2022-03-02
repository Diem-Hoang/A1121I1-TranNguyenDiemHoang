package ss4.BaiTap.StopWatch;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.getStartTime();
        System.out.print("Các số nguyên tố nhỏ hơn 100: ");
        for(int i = 2;i<=100;i++) {
            boolean check = true;
            for(int j = 2;j<= Math.sqrt(i);j++) {
                if(i%j == 0){
                    check = false;
                    break;
                }
            } if (check) {
                System.out.print(i + " ");}
        }
        stopWatch.getEndTime();
        System.out.println();
        System.out.println("Thời gian thực thi thuật toán tìm số nguyên tố: " + stopWatch.getElapsedTime());
    }
}
