package polymorphism.ex.sender;

public class FacebookSender implements ISender {
    @Override
    public void sendMessage(String message) {
        System.out.println("페이스북 메신저를 발송합니다: " + message);
    }
}
