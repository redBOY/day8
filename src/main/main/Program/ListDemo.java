package main.Program;
import java.util.ArrayList;
import java.util.Iterator;
class stu {
    int rollno;
    String name;
}
public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList list2 = new ArrayList();
        stu s1 = new stu();
        s1.rollno = 101;
        s1.name = "Mike";
        list1.add("john");
        list1.add("adithya");
        list1.add("hdcu");
        list1.add("jack");
        list1.add("Faran");

        list2.add("john");
        list2.add(10);
        list2.add(2.2);
        list2.add(3.3);
        list2.add(s1);

        System.out.println("list is: " + list1);
        System.out.println("list is: " + list2);

        String name = list1.get(2);
        System.out.println("name is: " + name);
        Object o = list2.get(2);
        System.out.println("o is: " + o);

        list1.set(2, "Fionna");
        System.out.println("list1 now is:" + list1);

        list1.remove(2);
        System.out.println("list after remove is:" + list1);

        if (list1.contains("john")) {
            System.out.println("john is in the list");
        }
        System.out.println("Ilterating with for loop");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        System.out.println("=========");

        System.out.println("Ilterating with enhanced for loop");
        for (String str : list1) {
            System.out.println(str);
        }
        System.out.println("=======");
        System.out.println("Ilterating with iterator");
        Iterator<String> itr = list1.iterator();

        System.out.println(itr.next());
        System.out.println(itr.next());

        while (itr.hasNext()) {
            String str = itr.next();
            System.out.println(str);
            if (str.equals("jack")) ;
            itr.remove();
        }
        System.out.println("=======");
        System.out.println("list after iteration is:"+list1);
    }
}
