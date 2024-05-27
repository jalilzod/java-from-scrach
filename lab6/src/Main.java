public class Main {
    public static void main(String[]args){
// Item 抽象类.
        Item item = new Produce("fish",20,4,"seafood");
        Item item1 = new Produce("crab",34,2,"seafood");
        Item item2 = new Produce("beef",90,5,"meat");
        Item item3 = new Beverage("Cola",6,1.5,0.2);
        Item item4 = new Beverage("WaHaHa",10,0.3,0.1);
        Item item5 = new Package("Chocolate",45,0.5,0.34,0.20);
        Item item6 = new Package("Chocolate",56,0.8,0.4,0.9);

        ShoppingCart cart = new ShoppingCart(10);
        cart.addItem(item);
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        cart.addItem(item4);
        cart.addItem(item5);
        cart.addItem(item6);

        cart.numberInCart("Chocolate");
        cart.display();
        cart.totalCost();


    }

}
