package constructor.grammar;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter; // this 생략 가능
    }
}
