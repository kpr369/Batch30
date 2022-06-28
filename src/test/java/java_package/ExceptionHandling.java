package java_package;

import java.io.FileNotFoundException;

public class ExceptionHandling {

    static String a;//null
    public static void main(String[] args) {

        try {
            System.out.println(5/0);

            throw new AutomationException("");
        }
        catch(NullPointerException e)
        {
            System.out.println("InSufficent Funds");
        }catch(ArithmeticException a)
        {
            System.out.println("Arithmetic Handled");
        }catch (StringIndexOutOfBoundsException se)
        {
            System.out.println("String exception handled");
        }
        catch(Exception e)
        {
            System.out.println("Test");
        }
        System.out.println("Hello");
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
    }
}
