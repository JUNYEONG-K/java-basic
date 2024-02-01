package reference.grammar;

public class VarChange2 {
    public static void main(String[] args) {
        Data data1 = new Data();
        data1.value = 10;
        Data data2 = data1;

        System.out.println("data1 = " + data1);
        System.out.println("data2 = " + data2);
        System.out.println("data1.value = " + data1.value);
        System.out.println("data2.value = " + data2.value);

        data1.value = 20;
        System.out.println("변경 data1.value = 20");
        System.out.println("data1.value = " + data1.value);
        System.out.println("data2.value = " + data2.value);

        data2.value = 30;
        System.out.println("변경 data2.value = 30");
        System.out.println("data1.value = " + data1.value);
        System.out.println("data2.value = " + data2.value);
    }
}
