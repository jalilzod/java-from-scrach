import java.util.ArrayList;

public class Farm {
    private ArrayList<Animal>animals;
    private Farmer farmer;
    private MilkProvider []mp;
    private EggProvider []ep;
    private int indexMilk;
    private int indexEgg;

    public Farm(){
        animals = new ArrayList<>();
        mp = new MilkProvider[10];
        ep = new EggProvider[10];
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public void animalSound(){
        for(Animal animal:animals){
            System.out.print(animal.getType()+" ");
            System.out.println(animal.getSound());
        }

    }

    public void produce(){
        for(Animal animal:animals){
            if(animal instanceof Cow)
                mp[indexMilk++] = (MilkProvider) animal;
            else if(animal instanceof Hen)
                ep[indexEgg++] = (EggProvider) animal;
        }

        for(int i = 0;i<indexMilk;i++){
            System.out.println(mp[i].getMilk());
        }
        for(int i = 0;i<indexEgg;i++){
            System.out.println(ep[i].getEgg());
        }
        
    }
}
