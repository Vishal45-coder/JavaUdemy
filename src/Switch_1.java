public class Switch_1 {
    public static void main(String[] args){

        int switchvalue=4;
        switch(switchvalue){
            case 1:
                System.out.println(switchvalue);
                break;
            case 2:
                System.out.println(switchvalue);
                break;
            case 3:case 4:
                System.out.println("fro 3 or 4");      
                break;
            default:
                System.out.println("number not present");      
        }
    }
    
}
