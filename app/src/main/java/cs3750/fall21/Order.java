package cs3750.fall21;

import java.util.ArrayList;

// Object class used to store the customer's order, which will later be serialized to the database
// *Currently, yes, this is a bit of a "waste" but it's meant to serve as the foundation for later changes and functionality - Austin 2
public class Order {

    private ArrayList<String> OrderItems;

    public Order() {
        OrderItems = new ArrayList<String>();
    }

    public Order(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            OrderItems.add(list.get(i));
        }
    }

    public void addItem(String item) {
        OrderItems.add(item);
    }

    public String getItem(int index) {
        return OrderItems.get(index);
    }

    public void removeItem(int index) {
        OrderItems.remove(index);
    }

    //This is for removing just one of the element
    public void removeItem(String item) {
        OrderItems.remove(item);
    }

    //This is for removing *all* of them
    public void clearItem(String item) {
        while(OrderItems.contains(item)) {
            OrderItems.remove(item);
        };
    }

    public void clearOrder() {
        OrderItems.clear();
    }

    public int orderSize() {
        return OrderItems.size();
    }

    public int itemCount(String item) {
        int count = 0;
        for (int i = 0; i < OrderItems.size(); i++) {
            if (OrderItems.get(i) == item) {
                count++;
            }
        }
        return count;
    }


}
