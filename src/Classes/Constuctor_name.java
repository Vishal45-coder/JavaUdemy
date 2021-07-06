package Classes;

public class Constuctor_name {

    String name;
    int age;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Constuctor_name(String name,int age)
    {
        this.setName(name);
        this.setAge(age);
    }

    public void printvalues(){
        System.out.println(this.getName());
        System.out.println(this.getAge());
    }
    public static void main(String[] args){
        Constuctor_name C1=new Constuctor_name("vishal",19);
        Constuctor_name C2=new Constuctor_name("Subhash",17);
        C1.printvalues();
        C2.printvalues();
    } 
    
}
