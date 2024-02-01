package pack.a;

public class User {
    public User() { // public 없으면 다른 패키지에서 사용 불가
        System.out.println("패키지 pack.a 회원 생성");
    }
}
