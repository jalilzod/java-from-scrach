public abstract class Animal {
    private String type;
    private String sound;

    public Animal(String type,String sound){
        this.sound = sound;
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    public  String getSound(){
        return this.sound;
    }

}
