import java.util.ArrayList;
import java.util.List;

public class Storage {
    private int capacity;
    private List<Product> storage;
    private double totalCost;

    public Storage(int capacity) {
        this.capacity = capacity;
        this.storage = new ArrayList<>();
        this.totalCost = 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Product> getStorage() {
        return storage;
    }

    public void setStorage(List<Product> storage) {
        this.storage = storage;
    }

    public double getTotalCost() {
        this.setTotalCost();
        return totalCost;
    }

    public void setTotalCost() {
        double totalCost = 0;

        for (Product product : storage) {
            totalCost += product.getPrice() * product.getQuantity();
        }

        this.totalCost = totalCost;
    }

    public void addProduct(Product product) {
        this.storage.add(product);
        int capacityAfterAddingProduct = this.capacity - product.getQuantity();
        this.setCapacity(capacityAfterAddingProduct);
    }

    public void getProducts() {
        StringBuilder sb = new StringBuilder("[").append(System.lineSeparator());

        for (Product product : storage) {
            sb.append(product.toString());
        }

        sb.append("]").append(System.lineSeparator());
        System.out.println(sb.toString().trim());
    }
}