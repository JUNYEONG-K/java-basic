package class1.grammar;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 18;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 17;
        student2.grade = 80;

        Student[] students = new Student[2]; // students: 배열의 참조값을 보관함.
        students[0] = student1; // 객체의 참조값을 보관함.
        students[1] = student2; // 객체의 참조값을 보관함.

        for (Student student : students) {
            System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
        }

        // 아래 2개의 값은 같다. 객체가 생성된 메모리 주소를 담고 있다.
        System.out.println(students[0]);
        System.out.println(student1);
    }
}
