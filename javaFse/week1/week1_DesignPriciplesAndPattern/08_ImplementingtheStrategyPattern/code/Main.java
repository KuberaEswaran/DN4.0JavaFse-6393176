
interface PaymentStrategy {

    void pay();
}

class Paypal implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("Paying using paypal ");
    }

}

class Shopping {

    PaymentStrategy paymentStrategy;

    public Shopping(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void buy() {
        paymentStrategy.pay();
    }
}

class Creditcard implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("Paying using Credit card ");
    }

}

public class Main {

    public static void main(String[] args) {
        Shopping shopping = new Shopping(new Creditcard());
        Shopping shopping2 = new Shopping(new Paypal());
        shopping.buy();
        shopping2.buy();
    }
}
