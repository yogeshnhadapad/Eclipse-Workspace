package oneDArray;

public class Main {

	public static void main(String[] args) {
        DeliveryManager manager = new DeliveryManager(5);

        // Adding deliveries
        manager.addDelivery(new Product("Laptop", 1), new Address("123 Main St", "Springfield", "12345"));
        manager.addDelivery(new Product("Phone", 2), new Address("456 Elm St", "Shelbyville", "67890"));
        
        // Displaying deliveries
        System.out.println("Deliveries:");
        manager.displayDeliveries();

        // Updating a delivery
        manager.updateDelivery(0, new Product("Tablet", 1));
        manager.updateDelivery(1, new Address("789 Oak St", "Capital City", "13579"));

        // Displaying deliveries after updates
        System.out.println("\nUpdated Deliveries:");
        manager.displayDeliveries();

        // Removing a delivery
        manager.removeDelivery(0);

        // Displaying deliveries after removal
        System.out.println("\nDeliveries after removal:");
        manager.displayDeliveries();
    }
}
