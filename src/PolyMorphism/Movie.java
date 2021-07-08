package PolyMorphism;

public class Movie {
    private String title;

    public Movie(String  title){
        this.title=title;
    }

    public String plot(){
        return "No plot here";
    }

    public String getTitle() {
        return title;
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
        }

    @Override
    public String plot() {
        return "A shark eats lot of people";
    }
}
class Independency extends Movie{
    public Independency() {
        super("Independence day");
    }

    @Override
    public String plot() {
        return "Aliens attemp take over planet";
    }
}

class Mazerunner extends Movie{

    public Mazerunner(){
        super("Mazerunner");
    }

    @Override
    public String plot() {
        return "Try and escape a Maze";
    }
}

class Starwars extends Movie{

    public Starwars() {
        super("Starwars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over universe";
    }
}

class Forgetable extends Movie{

    public Forgetable(){
        super("Forgettable");
    }
}
class All_Movies {
    public static void main(String[] args) {

        for (int i=1;i<11;i++){
            Movie movie=randomMovie();
            System.out.println ("movie #"+i+" : "+movie.getTitle() +"\n"+"Plot: "+movie.plot()+"\n");
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("random number : " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new Independency();
            case 3:
                return new Mazerunner();
            case 4:
                return new Starwars();
            case 5:
                return new Forgetable();
        }
        return null;
      }
}