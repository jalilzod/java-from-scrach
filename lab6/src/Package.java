public class Package extends Item{
    private double length;
    private double width;
    private double height;

    public Package(String name, double cost,double length,
                   double width,double height) {
        super(name, cost);
        this.length = length;
        this.width = width;
        this.height = height;
    }


    @Override
    double costPerUnit() {
        return super.getCost();
    }

    public double getSize(){
        return length*width*height;
    }

    @Override
    public String toString(){
        char rmb = 165;
        return "Name: "+super.getName()
                +" Cost:"+super.getCost()+rmb+ " Length "+length+" Height " +
                height+" Width "+width;
    }


}
