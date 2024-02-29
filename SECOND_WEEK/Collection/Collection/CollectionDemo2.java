package Collection.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<String>();
        System.out.println(c.add("hello"));
        System.out.println(c.add("world"));
        System.out.println(c.add("java"));
        System.out.println(c.remove("world"));
//        c.clear();
//        System.out.println(c.contains("world"));
//        System.out.println(c.isEmpty());
        System.out.println(c);
        c.clear();
    }
}
