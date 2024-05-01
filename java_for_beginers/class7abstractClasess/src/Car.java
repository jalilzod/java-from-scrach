abstract class Car {
    private String name;
    private double price;


    Car(String name,double price){
        this.name = name;
        this.price = price;
    }

    abstract void printData();
    abstract double countTax();
}
