package main.Program;
import java.util.HashSet;
import java.util.Iterator;
public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<String>();
        set1.add("Jerry");
        set1.add("jennie");
        set1.add("Harry");
        set1.add("William");
        set1.add("Mark");
        set1.add("john");
        set1.add("Mark");
        System.out.println("the set is"+set1);

        Iterator<String> itr = set1.iterator();
        while (itr.hasNext()) {
            String str = itr.next();
            System.out.println(str);
        }
        set1.remove("Harry");
        System.out.println("After removing Harry is"+set1);
        if (set1.contains("William"));
        System.out.println("William is in the set");
        System.out.println("set size is:  " + set1.size());
    }
}

