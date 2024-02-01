package access.grammar;

public class Speaker {
    private int volume; // 접근 제어자를 활용해, 외부 접근을 막음. 클래스 내에서만 접근 가능

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown() {
        if (volume <= 0) {
            System.out.println("음량을 감소할 수 없습니다. 최소 음량입니다.");
        } else {
            volume -= 10;
            System.out.println("volumeDown 호출");
        }
    }

    void showVolume() {
        System.out.println("현재 음량: " + volume);
    }
}
