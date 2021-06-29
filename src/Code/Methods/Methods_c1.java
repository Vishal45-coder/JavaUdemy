package Code.Methods;
public class Methods_c1 {
    public static void main(String[] args){
        
        //Player one
        int position=calculatescore(1500);
        dispnamepos("Dhoni",position);

        //Playeer two
        position=calculatescore(900);
        dispnamepos("Yuvaraj",position);

        //Player three
        position=calculatescore(400);
        dispnamepos("Rohit Sharma",position);
        
        //Player four
        position=calculatescore(50);
        dispnamepos("Virat",position);
    }
    public static void dispnamepos(String name,int position){
        System.out.println(name+" managed to get into position "+position+" on high score table\n");
    }

    public static int calculatescore(int score){
        if (score>=1000)
            return 1;
        else if(score>=500) //We can use this but it takes more time checks one more extra condition (score>=500 && score<1000)
            return 2;
        else if(score>=100)  //We can use this but it takes more time checks one more extra condition (score>=100 && score<500)
            return 3;
        else
            return 4;        

    }
}
