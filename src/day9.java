public class day9 {
    static class College implements AutoCloseable {
        College(){
            System.out.println("vetias");
        }

        @Override
        public void close() throws Exception {
            System.out.println("vetias Close");
        }
    }
    static class Department extends College  {
        Department (){
            System.out.println("AI");
        }

        @Override
        public void close() throws Exception {
            System.out.println("AI Close");
            super.close();
        }
    }

    static class YearofDepartment extends Department {
        YearofDepartment(){
            System.out.println("2025 of department");
        }

        @Override
        public void close() throws Exception {
            System.out.println("2028 Close");
            super.close();
        }
    }

    static void main() throws Exception {
        try(YearofDepartment YearofDepartment = new YearofDepartment()){

        }
    }
}