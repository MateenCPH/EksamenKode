package Task10;

public class Flower {
    private String name;
    private String color;
    private String scent;
    private int price;

    public Flower(String name, String color, String scent, int price) {
        this.name = name;
        this.color = color;
        this.scent = scent;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getScent() {
        return scent;
    }

    public int getPrice() {
        return price;
    }

    public String toString(){
        return "Flower name: " + name + " | Color: " + color + " | Scent: " + scent + " | Price: " + price;
    }
}
