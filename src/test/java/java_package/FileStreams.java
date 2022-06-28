package java_package;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class FileStreams {
    public static void main(String[] args) throws IOException {

      /*  System.out.println("Test");
        System.err.println("Test");

*//*        Scanner scanner = new Scanner(System.in);
        String  data = scanner.nextLine();

        System.out.println(data.toUpperCase());*//*


        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String data = b.readLine();
        System.out.println(data.toLowerCase());*/

      /* FileInputStream fis = new FileInputStream("C:\\TT\\Temp.txt");

        int data = fis.read();

        while(data!=-1)
        {
            System.out.print((char)data);
            data = data = fis.read();
        }
*/
       /* BufferedReader b = new BufferedReader(new FileReader("C:\\TT\\Temp.txt"));

      String data =   b.readLine();

      while( data != null) {
          System.out.println(data);
          data =   b.readLine();
      }*/

        PrintWriter pw = new PrintWriter("C:\\TT\\Temp1.txt");
        pw.print("Automation Selenium");
        pw.flush();
        pw.close();
    }
}
