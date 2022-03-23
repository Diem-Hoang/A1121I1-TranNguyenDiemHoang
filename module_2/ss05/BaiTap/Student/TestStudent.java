package ss05.BaiTap.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setName("Hoang");
        obj.setClasses("A1I1");
        System.out.println("Name: " + obj.getName());
        System.out.println("Class: " + obj.getClasses());
    }
}
