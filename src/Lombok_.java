import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public  class Lombok_ {
    int age;

    public static void main(String[] args) {
        Lombok_ Auto=new Lombok_();
        Auto.setAge(24);
        int x=Auto.getAge();
        System.out.println(x);
    }

}
