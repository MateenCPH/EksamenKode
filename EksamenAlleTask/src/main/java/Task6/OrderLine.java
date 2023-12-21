package Task6;

public class OrderLine {

    private Item item;
    private int amount;

    public OrderLine(Item item, int amount){
        this.item = item;
        this. amount = amount;
    }

    public double getTotalPrice(){
        return item.getPrice() * amount;
    }

    public String toString(){
        return "Orderline: \n" + " Item name: " + item.getName() + " | Amount: " + amount + " | Total price: " + getTotalPrice();
    }

}
