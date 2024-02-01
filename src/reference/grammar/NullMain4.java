package reference.grammar;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println("bigData.count = " + bigData.count); // 0 (기본값)
        System.out.println("bigData.data = " + bigData.data); // 메모리 주소

        System.out.println("bigData.data.value = " + bigData.data.value); // 0 (기본값)
    }
}
