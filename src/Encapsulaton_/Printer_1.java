package Encapsulaton_;

public class Printer_1 {
    
    private double tonerlevel,pages,pagesprinted;
    private boolean duplexprinter;


    public Printer_1(int tonerlevel, int pages, boolean duplexprinter) {
        this.tonerlevel = tonerlevel<=0 ? 0 : tonerlevel ;
        this.pages = pages<=0 ? 0 : pages;
        this.duplexprinter = duplexprinter;
    }

    public double getTonerlevel() {
		return tonerlevel;
	}


	public double getPages() {
		return pages;
	}


	public double getPagesprinted() {
		return pagesprinted;
	}


	public boolean isDuplexprinter() {
		return duplexprinter;
	}

    
    public void filluptoner(int toneramount){
        this.tonerlevel+=toneramount;
        System.out.println("Toner level after fill up of " + toneramount+" is: " +this.tonerlevel);
    }

    public void printingpages(int printpages){

        if(printpages>pages){
            System.out.println("There are no pages");
        }

        if(duplexprinter){
            this.pages-=printpages/2;
        }
        else{
            this.pages-=printpages;
        }
    }

	public static void main(String[] args) {
        Printer_1 hp = new Printer_1(59, 53, true);

        System.out.println("Toner level : " + hp.getTonerlevel());
        System.out.println("Total no.of pages : "+hp.getPages());
        System.out.println("Duplex printer : "+hp.isDuplexprinter());

        hp.filluptoner(52);
        hp.printingpages(53);
        System.out.println("Total no.of pages : "+hp.getPages());
    }
}
