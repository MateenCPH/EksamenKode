package Task6;

public class Item {

    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString(){
        return "Item name: " + name + " | Item price: " + price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
