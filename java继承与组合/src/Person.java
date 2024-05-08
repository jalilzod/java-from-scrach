public class Person {
    public Name name;
    public int age;
    private String gender;

    public Person(int age,String gender,Name name){
        this.age = age;
        this.gender = gender;
        this.name = name;
    }
    public Person(){}

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return this.gender;
    }

    public void talk(){
        System.out.println("Hi, how is it going");
    }
    public void talk(String s){
        System.out.println(s);
    }

    public void chatWith(Person a,String s){
        System.out.println(this.name+" to "+a.name+": s");
    }

}
