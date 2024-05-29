public class Pig implements Animal{
    private String type;
    private String sound;
    public Pig(String type,String sound){
        this.type = type;
        this.sound = sound;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String getSound() {
        return this.sound;
    }
}
