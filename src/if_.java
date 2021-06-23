public class if_{
    public static void main(String[] args){
    int score=210;

    if(score!=210)
        System.out.println("This is score");//Only this line will execute if the statement satisfies
        System.out.println("this is also score");//This is executed because there is no code block(Doesn't come under if block)

    
        if(score!=210);{
            System.out.println("This is score");//Only this line will execute if the statement satisfies
            System.out.println("this is also score");//This is executed because there is no code block(Doesn't come under if block)    
        }
    }
    
}
