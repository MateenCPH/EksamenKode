package Task6doMore;

public class Main {
    public static void main(String[] args) {


        Item i1 = new Item("Tomato", 20);
        Item i2 = new Item("Onion", 15);
        Item i3 = new Item("Carrot", 5);

        OrderLine line1 = new OrderLine(i1, 5);
        OrderLine line2 = new OrderLine(i2, 4);
        OrderLine line3 = new OrderLine(i3, 10);

        Order order1 = new Order();
        order1.addOrderLine(line1);
        order1.addOrderLine(line2);
        order1.addOrderLine(line3);
        System.out.println(order1);
    }
}
