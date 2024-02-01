package constructor.grammar;

public class MemberInit {
    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade) {
        System.out.println(this);
        this.name = name; // this: 인스턴스 자신의 참조값 (메모리 주소)
        this.age = age;
        this.grade = grade;
    }
}
