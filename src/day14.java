public class day14 {
    static class Student {
        String name;
        int age;
        int regNo;
        String dept;

        Student(Builder builder) {
            this.name = builder.name;
            this.age = builder.age;
            this.regNo = builder.regNo;
            this.dept = builder.dept;
        }

        static class Builder {
            private String name;
            private int age;
            private int regNo;
            private String dept;

            public Builder name(String nameValue) {
                this.name = nameValue;
                return this;
            }

            public Builder age(int ageValue) {
                this.age = ageValue;
                return this;
            }

            public Builder regNo(int regNoValue) {
                this.regNo = regNoValue;
                return this;
            }

            public Builder dept(String deptValue) {
                this.dept = deptValue;
                return this;
            }

            public Student build() {
                return new Student(this);
            }
        }
    }

    public static void main(String[] args) {
        Student student = new Student.Builder()
                .name("Madhu")
                .age(18)
                .regNo(25280147)
                .dept("AI")
                .build();

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.regNo);
        System.out.println(student.dept);
    }
}



