package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();

        map.put(1,"Automation");
        map.put(2,"Selenium");
        map.put(3,"Python");
        map.put(1,"Java");
        map.put(null,"Test");
        map.put(null,"T");

        System.out.println(map);
        List l = new ArrayList();

/*
        System.out.println(map.get(2));
        System.out.println(map.keySet());
        Set<Integer> set = map.keySet();
        System.out.println(map.values());
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("TTT"));*/
       // map.clear();
        //System.out.println(map);

       for(Map.Entry<Integer,String> entry:  map.entrySet())
       {
           System.out.print(entry.getKey());
           System.out.println(entry.getValue());
       }
    }
}
