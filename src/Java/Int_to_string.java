package Java;

public class Int_to_string {
    public static void main(String[] args){
        int i=100;
        String s=""+i+""; //Brute force change into string
        System.out.println(s);

        String s1=String.valueOf(i); //Function to change into  string
        System.out.println(s1);

        String s2=Integer.toString(i); //Another type of function to change into string
        System.out.println(s2);
    }
    
}
