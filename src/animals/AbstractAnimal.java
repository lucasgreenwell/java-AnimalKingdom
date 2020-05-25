package animals;

public abstract class AbstractAnimal {
    public static int maxId = 0;
    int id;
    String name;
    int yearDiscovered;

    public AbstractAnimal(String name, int yearDiscovered){
        this.name = name;
        this.yearDiscovered = yearDiscovered;
    }

    public abstract String move();
    public abstract String breathe();
    public abstract String reproduce();

    public String eat(){
        return "Crunch";
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getYearDiscovered(){
        return this.yearDiscovered;
    }

    public void setYearDiscovered(int yearDiscovered){
        this.yearDiscovered = yearDiscovered;
    }
}