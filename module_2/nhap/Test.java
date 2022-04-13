package nhap;

public class Test {
    public static void main(String[] args) {

        int i = 10, j = 5;
        Test t = new Test();
        System.out.println(t.compute(i, j));
    }

    public int compute(int i, int j){
        if(j == 0)
            return 0;
        else
            return i / j;
    }

}
