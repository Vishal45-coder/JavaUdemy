package Applications;

import java.util.Scanner;

import static java.lang.System.exit;

class Hamburger{
    private String name,meat,breadRollType;
    private double price;

    public Hamburger(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
        if(price>0){
            finalprice=price;
        }
        else{
            System.out.println(name+" Burger price is invalid which costs"+getPrice());
            exit(1);
        }
        System.out.println(getName()+" hamburger on a "+getBreadRollType()+" roll with "+getMeat()+", price is "+getPrice());
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public double getPrice() {
        return price;
    }


    private String addonname;
    private double addonprice,finalprice;

    public String getAddonname() {
        return addonname;
    }

    public double getAddonprice() {
        return addonprice;
    }

    public double getFinalprice() {
        return finalprice;
    }

    public void addHamburgeraddon(String addonname, double addonprice){
        this.addonname=addonname;
        this.addonprice = addonprice;
        if (addonprice>0.0){
            finalprice+=addonprice;
            System.out.println("Added "+getAddonname()+" for an extra "+getAddonprice());
        }
        else{
            System.out.println(getAddonname()+" has not been added due to inavlid price of "+getAddonprice());
        }
    }

    public double itemizeHamBurger(){
        return Math.round(getFinalprice()*100.0)/100.0; //we are using here round function so there will be no recurring values
    }

}

class Healthyburger extends Hamburger{

    public Healthyburger(String name, String meat, String breadRollType, double price) {
        super(name, meat, breadRollType, price);
    }

    
}

class Deluxeburger extends Hamburger{
    public Deluxeburger(String name, String meat, String breadRollType, double price) {
        super(name, meat, breadRollType, price);
    }
}
public class Bills_Burger_1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int burgervariant;
        System.out.println("enter the burger model");
        System.out.println("1.Basic burger\n2.Healthy Hamburger\n3.Deluxe Hamburger");
        burgervariant=sc.nextInt();
        sc.nextLine();
        Hamburger hamburger=burgermodel(burgervariant);

    if(burgervariant ==1 || burgervariant ==2) {
        if(burgervariant==2){
            System.out.println("It contains all the basic hamburger addons");
        }
        System.out.println("Enter total no.of addons");

        int totaladdons=sc.nextInt();
        sc.nextLine();

        for(int i=0;i<totaladdons;i++){
            System.out.println("Addon name");
            String addon=sc.nextLine();
            System.out.println("Addon price");
            double addonp=sc.nextDouble();
            sc.nextLine();
            hamburger.addHamburgeraddon(addon,addonp);
        }

        System.out.println("Total Burger price is " + hamburger.itemizeHamBurger());
    }
//    else if(burgervariant ==2){
//        hamburger.addHamburgeraddon("Egg", 5.43);
//        hamburger.addHamburgeraddon("Lentils", 3.41);
//        hamburger.addHamburgeraddon("Double cheese", 4);
//        System.out.println("Total Burger price is " + hamburger.itemizeHamBurger());
//    }
    else if(burgervariant==3){
        System.out.println("This cannot have extra addons of food");
        hamburger.addHamburgeraddon("Chips", 3);
        hamburger.addHamburgeraddon("Drink", 3.81);
        System.out.println("Total Burger price is " + hamburger.itemizeHamBurger());
    }
    sc.close();
    }

    public static Hamburger burgermodel(int burgeroption) {
        switch(burgeroption){
            case 1:
                return  new Hamburger("Basic", "Sausage", "White",3.56);
            case 2:
                return  new Healthyburger("Healthy","Bacaon","Brown",5.67);
            case 3:
                return  new Deluxeburger("Deluxe","Sausage & Bacaon","Brown",14.54);
        }
        return null;
    }
}
