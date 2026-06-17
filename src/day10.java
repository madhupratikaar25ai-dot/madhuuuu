
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

/*public class day10 {
    static void process(LinkedList<String> list) {
        System.out.println("Removed:" + list.removeFirst());
    }

    static void main() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Madhu");
        list.add("Supriya");
        list.add("Ram");
        list.add("Rey");
        list.add("Pradhish");
        while (list.size() > 0) {
            process(list);
        }
        System.out.println("queue is empty");
    }
}
*/
import java.util.LinkedList;

        public class day10 {

            static void process(LinkedList<String> list) {
                System.out.println("Removed : " + list.removeFirst());
            }

            public static void main(String[] args) {

                LinkedList<String> list = new LinkedList<>();

                // Add 5 students
                list.add("101 - madhu - 85");
                list.add("102 - Banu - 78");
                list.add("103 - Charu - 90");
                list.add("104 - Deepika - 88");
                list.add("105 - madhu- 75");

                System.out.println("Student List:");
                System.out.println(list);

                // Add one student
                list.add("106 - Farhan - 92");
                System.out.println("\nAfter Adding:");
                System.out.println(list);

                // Remove one student
                process(list);

                System.out.println("\nAfter Removing:");
                System.out.println(list);

                // Update one student
                list.set(2, "104 - Dinesh - 95");

                System.out.println("\nAfter Updating:");
                System.out.println(list);
            }
        }