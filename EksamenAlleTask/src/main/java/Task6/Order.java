package Task6;

import java.util.ArrayList;

public class Order {
    private ArrayList<OrderLine> orderlines;
    public Order(){
        this.orderlines = new ArrayList<>();
    }

    public double getTotalPrice(){
        double totalPrice = 0;
        for (OrderLine orderline : orderlines){
            totalPrice += orderline.getTotalPrice();
        }
        //System.out.println(totalPrice);
        return totalPrice;
    }

    public int getTotalAmount(){
        int totalAmount = 0;
        for (OrderLine orderline : orderlines){
            totalAmount += orderline.getAmount();
        }
        return totalAmount;
    }

    public void addOrderLine(OrderLine orderline){
        orderlines.add(orderline);
    }

    public String toString(){
        return "Orders: " + orderlines + "\nTotal order price: " + getTotalPrice() + "\nTotal amount: " + getTotalAmount();
    }
}
