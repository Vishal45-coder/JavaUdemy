public class If_else {
    public static void main(String[] args){
         int num=200;
         if(num<500 && num>200)
         {
             System.out.println(num);
         }
         else if(num>100){
             System.out.println(num);
         
         }
         else;{
            //This will be execute because it was having a semicolon after the else which does not check the condition
            System.out.println("This is score");
            System.out.println("this is also score");
            System.out.println("This will also print");
         }
    }
    
}
