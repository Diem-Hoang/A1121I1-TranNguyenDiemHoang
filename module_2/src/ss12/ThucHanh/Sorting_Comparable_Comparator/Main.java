package ss12.ThucHanh.Sorting_Comparable_Comparator;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Hoang", 21, "DaNang");
        Student student2 = new Student("Mai", 18, "HoChiMinh");
        Student student3 = new Student("Ngoc", 22, "HaiPhong");
        Student student4 = new Student("Nhu", 17, "HaNoi");

        List<Student> lists = new ArrayList<Student>();
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        lists.add(student4);

        Collections.sort(lists);
        for(Student st : lists){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(Student st : lists){
            System.out.println(st.toString());
        }
    }
}
