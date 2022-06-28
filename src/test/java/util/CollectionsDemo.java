package util;

import java.util.ArrayList;
import java.util.List;

public class CollectionsDemo {

    public static void main(String[] args) {

        List<String> listData = new ArrayList(); //Object

        listData.add("Automation");
        listData.add("Automation");
        listData.add("Java");
        listData.add(1, "Selenium");


        System.out.println(listData.size());
        System.out.println(listData.isEmpty());
        System.out.println(listData.contains("Java1"));
        System.out.println(listData.get(1));
        System.out.println(listData.indexOf("Java"));
       // System.out.println(listData.remove("Java"));
        System.out.println(listData.set(0,"Python"));
        System.out.println(listData);


    }
}
