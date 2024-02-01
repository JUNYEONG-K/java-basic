package oop.grammar;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData musicPlayerData = new MusicPlayerData();

        on(musicPlayerData);
        volumeUp(musicPlayerData);
        volumeUp(musicPlayerData);
        volumeUp(musicPlayerData);
        volumeDown(musicPlayerData);
        showStatus(musicPlayerData);
        off(musicPlayerData);
    }

    static void on(MusicPlayerData musicPlayerData) {
        musicPlayerData.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void volumeUp(MusicPlayerData musicPlayerData) {
        musicPlayerData.volume++;
        System.out.println("음악 플레이어 볼륨: " + musicPlayerData.volume);
    }

    static void volumeDown(MusicPlayerData musicPlayerData) {
        musicPlayerData.volume--;
        System.out.println("음악 플레이어 볼륨: " + musicPlayerData.volume);
    }

    static void showStatus(MusicPlayerData musicPlayerData) {
        System.out.println("음악 플레이어 상태 확인");
        if (musicPlayerData.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + musicPlayerData.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }

    static void off(MusicPlayerData musicPlayerData) {
        musicPlayerData.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
