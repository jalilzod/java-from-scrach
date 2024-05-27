public class Produce extends Item{
    private double pounds;
    private String category;

    public Produce(String name, double cost,double pounds,
                   String category) {
        super(name, cost);
        this.pounds = pounds;
        this.category = category;

    }

    @Override
    double costPerUnit() {
        return super.getCost();
    }

    public double getPounds(){
        return this.pounds;
    }
    void setPounds(double pounds){
        this.pounds = pounds;
    }

    public String getCategory(){
        return this.category;
    }

    public void setCategory(){
        this.category = category;
    }


    @Override
    public String toString(){
        char rmb = 165;
        return  "Name: "+super.getName()
                +" Cost:"+super.getCost()+rmb+ " Category "+category+" Pounds "+pounds;
    }



}
