package animals;

public class Mammal extends AbstractAnimal {
    public Mammal(String name, int yearDiscovered){
        super(name, yearDiscovered);
    }

    @Override
    public String move()
    {
        return this.name + " walks.";
    }

    @Override
    public String breath()
    {
        return "Lungs";
    }

    @Override
    public String reproduce()
    {
        return this.name + " has just had a live birth!";
    }
}