import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item>items;
    private int maxSize;
    private int currentSize;

    public ShoppingCart(int maxSize){
        items = new ArrayList<>(maxSize);
    }
    public void addItem(Item item){
        items.add(item);
        currentSize++;
    }

    public void display(){
        for(Item item:items){
            System.out.println(item.toString());
        }
    }

    public void totalCost(){
        double total = 0;
        for(Item item:items){
            total+=item.cost;
        }
        System.out.println("Total cost: "+total);
    }

    public void numberInCart(String name){
        int total = 0;
        for(Item item:items){
            if(item.name.equals(name))
                total++;
        }

        System.out.println(total+" "+name+
                " items in cart");
    }
}
