package static2.grammar;

public class DecoMain2 {

    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s); // 굳이 객체 생성 x, static 함수 호출

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
