public class Main {
    public void main(String[]args){

        Name name1 = new Name("Sina","Sheibani");
        Name name2 = new Name("Kiyomiddin","Jalilzod");
        Person person1 = new Person(25,"Male",name1);
        Person person2 = new Person(25,"Male",name2);
        person1.chatWith(person2,"Ghamgin mabosh!");
        person2.chatWith(person1,"Ok!");


    }
}
