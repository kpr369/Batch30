package util;

public class MethodOverloading {

    public static void add(int a, int b)
    {

    }


    public static void add(int a,int b,int c)
    {

    }

    public static void main(String[] args) {

        add(10,20);
        add(10,30,40);
        System.out.println(10);
        System.out.println("");
        System.out.println(2.5);
        System.out.println(true);;
        test("");
        test(true);
        test(1.0);
        test(1);
    }
public static void test(int a)
{

}
    public static void test(double a)
    {

    }

    public static void test(String a)
    {

    }
    public static void test(boolean a)
    {

    }

}
