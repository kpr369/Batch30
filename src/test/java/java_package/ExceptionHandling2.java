package java_package;

import java.io.FileNotFoundException;

public class ExceptionHandling2 {
    public static void main(String[] args) throws InterruptedException {
        test();

        try {
            System.out.println(5 / 0);
        }catch (Exception e)
        {
            try {
                System.out.println(5 / 0);
            }catch (Exception ee)
            {

            }
        }
    }

    public static void test() throws InterruptedException {
        Thread.sleep(400);
    }
}
