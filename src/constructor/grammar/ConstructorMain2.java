package constructor.grammar;

public class ConstructorMain2 {
    public static void main(String[] args) {
        MemberConstructor member1 = new MemberConstructor("user1", 15); // grade 는 기본 50
        MemberConstructor member2 = new MemberConstructor("user2", 18, 80);

        MemberConstructor[] members = {member1, member2};

        for (MemberConstructor member : members) {
            System.out.println("이름: " + member.name + ", 나이: " + member.age + ", 성적: " + member.grade);
        }
    }
}
