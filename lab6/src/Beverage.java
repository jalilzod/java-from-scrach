public class Beverage extends Item{

    private double volume;
    private double containerDeposit;

    public Beverage(String name, double cost,
                    double volume,double containerDeposit) {
        super(name, cost);
        this.volume = volume;
        this.containerDeposit = containerDeposit;
    }


    @Override
    double costPerUnit() {
        return super.getCost();
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getContainerDeposit() {
        return containerDeposit;
    }

    public void setContainerDeposit(double containerDeposit) {
        this.containerDeposit = containerDeposit;
    }

    @Override
    public String toString(){
        char rmb = 165;
        return "Name: "+super.getName()
                +" Cost:"+super.getCost()+rmb+ " "+ "Volume "+volume+" Container "+containerDeposit;
    }




}
