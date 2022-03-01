package ss5.ThucHanh.StaticMethod;

public class Student {
    private int no;
    private String name;
    private static String college = "OLD";

    Student(int r, String n) {
        no = r;
        name = n;
    }

    static void change() {
        college = "NEW";
    }

    void display() {
        System.out.println(no + " " + name + " " + college);
    }
}
