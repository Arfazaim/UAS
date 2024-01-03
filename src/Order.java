import java.util.ArrayList;
import java.util.List;

// Class untuk merepresentasikan orderan
class Order {
    private List<JokiService> services;

    public Order() {
        this.services = new ArrayList<>();
    }

    public void addService(JokiService service) {
        services.add(service);
    }

    public double calculateTotal() {
        double total = 0;
        for (JokiService service : services) {
            total += service.getPrice();
        }
        return total;
    }

    public void displayOrder() {
        System.out.println("Order Details:");
        for (JokiService service : services) {
            System.out.println("- " + service.getServiceName() + ": $" + service.getPrice());
        }
        System.out.println("Total: $" + calculateTotal());
    }
}