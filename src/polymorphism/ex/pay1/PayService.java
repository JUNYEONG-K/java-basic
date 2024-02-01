package polymorphism.ex.pay1;

public class PayService {
    public void processPay(String option, int amount) {
        boolean result = false;
        System.out.println("결제를 시작합니다: option = " + option + ", amount = " + amount);

        IPay pay = PayStore.findPay(option);

        result = pay.pay(amount);

        pay(result);
    }

    private void pay(boolean result) {
        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}
