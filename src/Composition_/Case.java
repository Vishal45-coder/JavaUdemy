package Composition_;

public class Case {
    
    private String model,maufacturer,powerSupply;
    private Dimensions dimensions;

    public Case(String model, String maufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.maufacturer = maufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }
    
    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }

	public String getModel() {
		return model;
	}

	public String getMaufacturer() {
		return maufacturer;
	}

	public String getPowerSupply() {
		return powerSupply;
	}

	public Dimensions getDimensions() {
		return dimensions;
	}

    
    
}
