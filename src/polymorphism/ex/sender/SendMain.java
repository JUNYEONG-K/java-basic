package polymorphism.ex.sender;

public class SendMain {
    public static void main(String[] args) {
        ISender[] senders = {new EmailSender(), new SmsSender(), new FacebookSender()};

        for (ISender sender : senders) {
            sender.sendMessage("환영합니다!");
        }
    }
}
