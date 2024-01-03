public class JokiApp {
    public static void main(String[] args) {
        JokiService service1 = new JokiService("Game Joki", 20.0);
        JokiService service2 = new JokiService("Rank Boosting", 30.0);

        Order order = new Order();
        order.addService(service1);
        order.addService(service2);

        order.displayOrder();
    }
}