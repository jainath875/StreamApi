package java_core_interview_questions.refrence_content;

class Student {
    int x = 34;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return x == student.x;
    }
}

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student();
        System.out.println(student == student2);
        System.out.println(student.equals(student2));
    }
}
