package Applications;

import java.util.Scanner;

import static java.lang.System.exit;

class Hamburger {
    private String name, meat, breadRollType;
    private double price;

    public Hamburger(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
        if (price > 0) {
            finalprice = price;
        } else {
            System.out.println(name + " Burger price is invalid which costs" + getPrice());
            exit(1);
        }

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


    private String addonname1, addonname2, addonname3, addonname4;
    private double addonprice1, addonprice2, addonprice3, addonprice4, finalprice;

    public String getAddonname1() {
        return addonname1;
    }

    public String getAddonname2() {
        return addonname2;
    }

    public String getAddonname3() {
        return addonname3;
    }

    public String getAddonname4() {
        return addonname4;
    }

    public double getAddonprice1() {
        return addonprice1;
    }

    public double getAddonprice2() {
        return addonprice2;
    }

    public double getAddonprice3() {
        return addonprice3;
    }

    public double getAddonprice4() {
        return addonprice4;
    }

    public double getFinalprice() {
        return finalprice;
    }

    public void addon1(String name, double price) {
        this.addonname1 = name;
        this.addonprice1 = price;
    }

    public void addon2(String name, double price) {
        this.addonname2 = name;
        this.addonprice2 = price;
    }

    public void addon3(String name, double price) {
        this.addonname3 = name;
        this.addonprice3 = price;
    }

    public void addon4(String name, double price) {
        this.addonname4 = name;
        this.addonprice4 = price;
    }

    public double itemizeHamBurger() {
        System.out.println(getName() + " hamburger on a " + getBreadRollType() + " roll with " + getMeat() + ", price is " + getPrice());
        if (addonprice1 > 0) {
            finalprice += addonprice1;
            System.out.println(getAddonname1() + " added for price " + getAddonprice1());
        } else if(addonname1!=null){
            System.out.println(getAddonname1() + " not added price is invalid which costs" + getAddonprice1());
        }

        if (addonprice2 > 0) {
            finalprice += addonprice2;
            System.out.println(getAddonname2() + " added for price " + getAddonprice2());
        } else if(addonname2!=null){
            System.out.println(getAddonname2() + " not added price is invalid which costs" + getAddonprice2());
        }

        if (addonprice3 > 0) {
            finalprice += addonprice3;
            System.out.println(getAddonname3() + " added for price " + getAddonprice3());
        } else if(addonname3!=null){
            System.out.println(getAddonname3() + " not added price is invalid which costs" + getAddonprice3());
        }

        if (addonprice4 > 0) {
            finalprice += addonprice4;
            System.out.println(getAddonname4() + " added for price " + getAddonprice4());
        } else if(addonname4!=null){
            System.out.println(getAddonname4() + " not added price is invalid which costs" + getAddonprice4());
        }

        return Math.round(getFinalprice() * 100.0) / 100.0; //we are using here round function so there will be no recurring values
    }
}
class Healthyburger extends Hamburger{

    public Healthyburger(String name, String meat, String breadRollType, double price) {
        super(name, meat, breadRollType, price);
    }
    
}

class Deluxeburger extends Healthyburger{
    public Deluxeburger(String name, String meat, String breadRollType, double price) {
        super(name, meat, breadRollType, price);
    }

}
public class Bills_Burger_1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the burger model");
        System.out.println("1.Basic burger\n2.Healthy Hamburger\n3.Deluxe Hamburger");
        int burgervariant=sc.nextInt();
        sc.nextLine();  //To read the input on the upper line

        /**
         * It goes to the burgermodel method with the parameter of burgervariant
         * It return the object for the particulasr class
         * It is done at runtiume
         */
        Hamburger hamburger=burgermodel(burgervariant);

    if(burgervariant ==1 || burgervariant ==2) {
        if(burgervariant==2){
            System.out.println("It contains all the basic hamburger addons");
        }
        System.out.println("Maximum addons are 4");
        System.out.println("Enter total no.of addons");

        int totaladdons=sc.nextInt();
        sc.nextLine();

        if(totaladdons>4){
            exit(-1);
        }
        for(int i=0;i<totaladdons;i++){
            System.out.println("Addon name");
            String addon=sc.nextLine();
            System.out.println("Addon price");
            double addonp=sc.nextDouble();
            sc.nextLine();
            if(i==0){
                hamburger.addon1(addon,addonp);
            }
            else if(i==1){
                hamburger.addon2(addon,addonp);
            }
            else if(i==2){
                hamburger.addon3(addon,addonp);
            }
            else {
                hamburger.addon4(addon,addonp);
            }
        }

        System.out.println("Total Burger price is " + hamburger.itemizeHamBurger());
    }
    else if(burgervariant==3){
        System.out.println("This cannot have extra addons of food");
        hamburger.addon1("Chips", 3);
        hamburger.addon2("Drink", 3.81);
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
