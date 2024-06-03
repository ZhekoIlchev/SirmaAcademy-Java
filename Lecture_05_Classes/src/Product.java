public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{")
                .append(System.lineSeparator());
        sb.append("name: ").append(this.getName()).append(System.lineSeparator());
        sb.append("price: ").append(this.getPrice()).append(System.lineSeparator());
        sb.append("quantity: ").append(this.getQuantity()).append(System.lineSeparator());
        sb.append("},").append(System.lineSeparator());

        return sb.toString();
    }
}