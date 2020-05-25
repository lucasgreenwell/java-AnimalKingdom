package animals;

public class Fish extends AbstractAnimal {
    public Fish(String name, int yearDiscovered){
        super(name, yearDiscovered);
    }

    @Override
    public String move()
    {
        return this.name + " swims.";
    }

    @Override
    public String breath()
    {
        return "Gills";
    }

    @Override
    public String reproduce()
    {
        return this.name + " has just laid eggs!";
    }

}