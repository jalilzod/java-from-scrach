public class Name {
    private String firstName;
    private String lastName;

    public Name(String firstName,String lastName){
        setFirstName(firstName);
        setLastName(lastName);
    }

    public Name(){}

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return  this.lastName;
    }

    @Override
    public String toString(){
        return "First Name: "+getFirstName()+"\n"
                +"Last Name: "+getLastName();
    }


}
