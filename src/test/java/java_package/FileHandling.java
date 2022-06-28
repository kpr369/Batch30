package java_package;

import java.io.File;
import java.io.IOException;

public class FileHandling {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\TT");
       // file.createNewFile();
       /* System.out.println(file.exists());
        file.createNewFile();
        System.out.println(file.exists());*/
        //file.mkdir();
/*        System.out.println(file.isFile());
        System.out.println(file.isDirectory());*/
        //System.out.println(file.length());
        /*System.out.println(file.canRead());
        System.out.println(file.canExecute());
        System.out.println(file.canWrite());*/
/*
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(file.getParent());

        file.renameTo(new File("C:\\TT\\Selenium.txt"));*/

       for(String fileName : file.list())
       {
           System.out.println(fileName);
       }

       for(File fileObject : file.listFiles())
       {
           fileObject.delete();
       }
    }
}
