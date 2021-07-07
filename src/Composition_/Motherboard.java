package Composition_;

public class Motherboard {

    private String model,maufacturer,bios;
    private int ramslots,cardslots;
    
    public Motherboard(String model, String maufacturer, String bios, int ramslots, int cardslots) {
        this.model = model;
        this.maufacturer = maufacturer;
        this.bios = bios;
        this.ramslots = ramslots;
        this.cardslots = cardslots;
    }

    public void loadProgram(String programName) {
        System.out.println("Program "+programName+" is runniung");
    }
    public String getModel() {
        return model;
    }

    public String getMaufacturer() {
        return maufacturer;
    }

    public String getBios() {
        return bios;
    }

    public int getRamslots() {
        return ramslots;
    }


    public int getCardslots() {
        return cardslots;
    }

}
