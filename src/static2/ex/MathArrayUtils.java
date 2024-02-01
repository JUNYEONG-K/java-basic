package static2.ex;

public class MathArrayUtils {
    private MathArrayUtils() {
        // 생성자 호출을 아예 막아버림. -> 제약을 둠으로써 static 함을 강조
    }

    public static int sum(int[] array) {
        int total = 0;
        for (int i : array) {
            total += i;
        }
        return total;
    }

    public static double average(int[] array) {
        int total = sum(array);
        return (double) total / array.length;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (min > i) min = i;
        }
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (max < i) max = i;
        }
        return max;
    }
}
