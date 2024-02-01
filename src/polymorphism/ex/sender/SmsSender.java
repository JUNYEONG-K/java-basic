package polymorphism.ex.sender;

public class SmsSender implements ISender {
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS를 발송합니다: " + message);
    }
}
