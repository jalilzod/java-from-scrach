import java.util.ArrayList;

public class Farm {
    private ArrayList<Animal>animals;


    public Farm(){
        animals = new ArrayList<>();
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
}
