
/*import java.util.ArrayList;
public class day10 {
    static void main() {
        String[] Student = {"Madhu", "Supriya", "Ram", "Rey", "Pradhish"};
        System.out.println(Student.length);
        ArrayList<String> list = new ArrayList();
        list.add("Madhu");
        list.add("Supriya");
        list.add("Ram");
        list.add("Rey");
        list.add("Pradhish");
        for (String s : list) {
            System.out.print(s);
        }
        list.remove("Ram");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println(list);
    }
}
*/
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class day10 {
    static void process(LinkedList<String>list){
        System.out.println("Removed:" + list.removeFirst());
    }
   static void main() {
        LinkedList<String>list = new LinkedList<>();
        list.add("Madhu");
        list.add("Supriya");
        list.add("Ram");
        list.add("Rey");
        list.add("Pradhish");
        while (list.size()> 0) {
            process(list);
        }
        System.out.println("queue is empty");
    }
}


