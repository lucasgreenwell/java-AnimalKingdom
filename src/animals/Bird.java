package animals;

public class Bird extends AbstractAnimal {
    public Bird(String name, int yearDiscovered){
        super(name, yearDiscovered);
    }

    @Override
    public String move()
    {
        return this.name + " flies.";
    }

    @Override
    public String breath()
    {
        return "Lungs";
    }

    @Override
    public String reproduce()
    {
        return this.name + " has just laid eggs!";
    }

}