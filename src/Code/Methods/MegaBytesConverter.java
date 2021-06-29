package Code.Methods;

public class MegaBytesConverter {
    public static void main(String[] args){

        printMegaBytesAndKiloBytes(2500);
    }
    public static void printMegaBytesAndKiloBytes(int kb){
        if(kb<0){
            System.out.println("Invalid Value");
        }
        else{
            int div=kb/1024;
            int div1=kb%1024;
            System.out.println(kb+" KB = "+div+" MB and "+div1+" KB");
        }

    }
}

