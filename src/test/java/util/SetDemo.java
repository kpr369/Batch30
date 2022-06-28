package util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(20);
        set.add(22);
        set.add(20);
        set.add(26);
        set.add(50);
        set.add(78);
        Iterator<Integer> iterator = set.iterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}
