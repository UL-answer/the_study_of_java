package Collection.Collection;

import java.util.ArrayList;
import java.util.Collection;
public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<String>();
        c.add("hello");
        c.add("world");
        c.add("java");
        System.out.println(c);
    }
}
