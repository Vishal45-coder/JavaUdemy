package Composition_;


public class PC_values {

    public static void main(String[] args) {

        //Creating an objects for their particular classes

        Dimensions dimensions = new Dimensions(20,20,5);  

        Case theCase = new Case("220B","dell","240",dimensions);

        Monitor theMonitor = new Monitor("27 inch beats","Äcer",27,new Resolution(2540, 1400)); //We are sending object values as reference instead of creating an object

        Motherboard theMotherboard= new Motherboard("BJ-200","Asus","v2.44",4,6);

        PC thePC= new PC(theCase,theMonitor,theMotherboard);
        

        thePC.getTheMonitor().drawPixelAt(1500, 1200, "red");
        thePC.getTheMotherboard().loadProgram("Windows 10");
        thePC.getTheCase().pressPowerButton();

    }
}
