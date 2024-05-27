public abstract class Item {
    protected final String name;
    protected final double cost;

    public Item(String name,double cost){
        this.name = name;
        this.cost  = cost;
    }

    public double getCost(){
        return this.cost;
    }
    public String getName(){
        return this.name;
    }

    abstract double costPerUnit();

    @Override
    public String toString(){
        return "Product: "+name+" Cost: "+cost;
    }

}
