public class Main {
    public static void main(String[]args){
        Animal hen = new Hen("Hen","cheep","fetching eggs....");
        Animal cow = new Cow("cow","moo","fetching milk....");
        Animal pig = new Pig("Pig","oink");

        Farm farm = new Farm();
        farm.addAnimal(hen);
        farm.addAnimal(cow);
        farm.addAnimal(pig);

        farm.produce();
        farm.animalSound();





    }
}
