public class Car extends Vehicle{
    String name;
    double price;

    public Car(String brand, String type,String name,double price) {
        super(brand, type);
        this.name = name;
        this.price = price;

    }

    void showAttributes(){
        System.out.println("Name: "+this.name);
        System.out.println("Price: "+this.price);
        System.out.println("Type: "+super.type);
        System.out.println("Brand: "+super.brand);
    }
}
