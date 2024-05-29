public class Hen  implements Animal,EggProvider{
    private String type;
    private String sound;
    private String egg;
    public Hen(String type,String sound,String egg){
        this.type = type;
        this.sound = sound;
        this.egg = egg;
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
    public String getEgg() {
        return this.egg;
    }
}
