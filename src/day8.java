 public class day8 {
     record CourseRecord(String AI, String IT) {
     }

      static void main() {
         CourseRecord courserecord = new CourseRecord("AI","IT" +
                 "");
         System.out.println(courserecord.AI());
         System.out.println(courserecord.IT());
     }
 }