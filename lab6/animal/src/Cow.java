public class Cow implements Animal,MilkProvider{
    private String type;
    private String sound;
    private String milk;
    public Cow(String type,String sound,String milk){
        this.type = type;
        this.sound = sound;
        this.milk = milk;
    }


    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String getSound() {
        return this.sound;
    }

    @Override
    public String getMilk() {
        return this.milk;
    }
}
