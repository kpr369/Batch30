package java_package;

import util.A;

public class StaticBlock extends A {

    static int count;
    public static void main(String[] args) {

        System.out.println("Main Method");

        StaticBlock sb = new StaticBlock();
        StaticBlock sb1 = new StaticBlock();
        StaticBlock sb2 = new StaticBlock();
        StaticBlock sb3 = new StaticBlock();

        System.out.println(count);
    }

    StaticBlock()
    {
        //super();
        System.out.println("Constrctor");
    }

    static  {
        System.out.println("Static Block");
    }

    {
        System.out.println("Instance Block");
        count++;
    }

}
