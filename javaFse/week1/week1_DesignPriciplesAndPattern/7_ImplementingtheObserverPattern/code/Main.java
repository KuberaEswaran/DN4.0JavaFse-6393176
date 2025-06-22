
import java.util.ArrayList;
import java.util.List;

interface Observable {

    void register(Observers obj);

    void deregister(Observers obj);

    void notifyObservers();

    void setData(int data);

    int getData();
}

class Stock implements Observable {

    List<Observers> l = new ArrayList<>();
    static int data = 0;

    @Override
    public void register(Observers obj) {
        l.add(obj);
    }

    @Override
    public void deregister(Observers obj) {
        l.remove(obj);
    }

    @Override
    public void notifyObservers() {
        for (Observers obj : l) {
            obj.update();
        }
    }

    @Override
    public void setData(int data) {
        data += this.data;
        if (data > 0) {
            notifyObservers();
        }

    }

    @Override
    public int getData() {
        return data;
    }

}

interface Observers {

    void update();
}

class MobileApp implements Observers {

    int phone;

    public MobileApp(int phone) {
        this.phone = phone;
    }

    @Override
    public void update() {
        sendMessageOnMobile("Stock is Available hurry Up");
    }

    void sendMessageOnMobile(String msg) {
        System.out.println("Message Sent Mobile Number " + phone + ":" + msg);
    }
}

class WebApp implements Observers {

    String username;

    public WebApp(String username) {
        this.username = username;
    }

    @Override
    public void update() {
        sendMessageOnWeb("Stock is Available hurry Up");
    }

    void sendMessageOnWeb(String msg) {
        System.out.println("Msg Send by Web app to the user " + username + ":" + msg);
    }
}

public class Main {

    public static void main(String[] args) {
        Stock stock = new Stock();

        Observers webApp = new WebApp("jon");
        Observers mobileApp = new MobileApp(987654321);

        stock.register(webApp);
        stock.register(mobileApp);

        stock.setData(5);
    }
}
