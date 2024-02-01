package constructor.grammar;

public class MemberConstructor {
    String name;
    int age;
    int grade;

    MemberConstructor(String name, int age) {
        this(name, age, 50); // this() 는 생성자의 코드의 첫줄에만 작성할 수 있다.
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
    }
    MemberConstructor(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + ", age = " + age +", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
