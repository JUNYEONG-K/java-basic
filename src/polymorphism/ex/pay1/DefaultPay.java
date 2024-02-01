package polymorphism.ex.pay1;

public class DefaultPay implements IPay {
    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없습니다.");
        return false;
    }
}
