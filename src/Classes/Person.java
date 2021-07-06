package Classes;

public class Person {
    private String firstName,lastName;
    private int age;


    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age<0 || age>100){
            this.age=0;
        }
        else{
        this.age = age;
        }
    }

    public boolean isTeen(){
        if(age>12 && age<20){
            return true;
        }
        return false;
    }

    public String  getFullName(){
        if(firstName.isEmpty()){
            return lastName;
        }
        else if(lastName.isEmpty()){
            return firstName;
        }
        else if(lastName.isEmpty() && firstName.isEmpty()){
            return "";
        }
        else{
            return firstName+" "+lastName;
        }
    }

    
}

class Person_values{
    public static void main(String[] args){
        Person person = new Person();

        person.setFirstName("Vishal");
        person.setLastName("Raavi");
        person.setAge(19);

        System.out.println("Name : "+person.getFullName());
        System.out.println("Age : "+person.getAge());
        System.out.println("Teenageer : "+person.isTeen());
      
    }
}