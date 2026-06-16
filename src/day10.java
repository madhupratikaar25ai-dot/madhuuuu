import java.util.ArrayList;
public class day10 {
 static void main() {
     String[] Student= {"Madhu","Supriya","Ram","Rey","P" +
             "radhish"};
     System.out.println(Student.length);
     ArrayList<String> list = new ArrayList();
     list.add("Madhu");
     list.add("Supriya");
     list.add("Ram");
     list.add("Rey");
     list.add("Pradhish");
     for(String s: list) {
         System.out.print(s);
     }
         list.remove("Ram");
         System.out.println(list.getFirst());
         System.out.println(list.getLast());
     System.out.println();
     for(String s: list) {
         System.out.println(s);
     }
     System.out.println();
         System.out.println(list);
     }
 }


