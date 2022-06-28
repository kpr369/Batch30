import java.io.File;
import java.io.IOException;

public class FileDemo {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\Purushothama_Kurnool\\Personal\\TT\\automation.txt");
        File file1 = new File("C:\\Users\\Purushothama_Kurnool\\Personal\\automation1.txt");
        file.renameTo(file1);
        /*System.out.println(file.exists());
        file.createNewFile();
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParentFile());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.length());*/

      /*for(String fileName: file.list())
      {
          System.out.println(fileName);
      }

     for(File files : file.listFiles())
     {
         System.out.println(files.getParentFile().getName());
     }*/





    }
}
