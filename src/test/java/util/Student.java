package util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student extends A {

    String studentName = "A";
    int studentNumber;

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(10);
        List<Integer> k = new ArrayList<>();
        k=l;
        System.out.println(k);

       /* Student st1 = new Student("ABC", 29);
        System.out.println(st1.studentName);
        System.out.println(st1.studentNumber);*/
    }

    public Student(String name, int no) {
        super();
        studentName = name;
        studentNumber = no;
        Map m = new HashMap();
    }

   /* public Student()
    {
        System.out.println("T");
    }

    public Student(int a)
    {
        System.out.println("TTTTT");
    }*/
}
