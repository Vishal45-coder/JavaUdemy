package Composition_;

class Livingroom{

    private String TVModel;
    private String SofaModel;

    public Livingroom(String tVModel, String sofaModel) {
        TVModel = tVModel;
        SofaModel = sofaModel;
    }

    public String getTVModel() {
        return TVModel;
    }


    /**
     * This is a private method which means it cannot be accesses with the help of another class.
     * @return  the sofamodel in the living room
     */
    private String getSofaModel() {
        return SofaModel;
    }

    /**
     * This is a public getPrivateMethod which is used to access the private method 
     * @return the private value of the getSofaModel
     */
    public String getPrivateMethods() {
        return getSofaModel();
    }
    
    
}
public class House {
    
    Livingroom room;

    public House(Livingroom room) {
        this.room = room;
    }

    public Livingroom getRoom() {
        return room;
    }

    public static void main(String[] args){

        String value;

        Livingroom room = new Livingroom("VU 75 Inches","Leather");
        House house=new House(room);

        value=house.getRoom().getTVModel();
        System.out.println("TV model : "+value);

        value=house.getRoom().getPrivateMethods(); //We cant access the sofa method  because it is private method so we access it through public method
        System.out.println("Sofa Model : "+value);

    }
}
