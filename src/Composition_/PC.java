package Composition_;

public class PC {
    
/*
PC has these three classes
These three classes were used here instead of inheritance because it will be limiited 
**/


    private Case theCase;
    private Monitor theMonitor;
    private Motherboard theMotherboard;

    public PC(Case theCase, Monitor theMonitor, Motherboard theMotherboard) {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.theMotherboard = theMotherboard;
    }

	public Case getTheCase() {
		return theCase;
	}

	public Monitor getTheMonitor() {
		return theMonitor;
	}

	public Motherboard getTheMotherboard() {
		return theMotherboard;
	}
}
