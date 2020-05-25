package animals;
import java.util.*;

public class Main{
    public static void main(){
        //set up an array to fill with all your instances
        ArrayList<AbstractAnimal> animalList = new ArrayList<AbstractAnimal>();

        //call your mammals a bunch of times
        animalList.add(new Mammal("Panda", 1869));
        animalList.add(new Mammal("Zebra", 1778));
        animalList.add(new Mammal("Koala", 1816));
        animalList.add(new Mammal("Sloth", 1804));
        animalList.add(new Mammal("Armadillo", 1758));
        animalList.add(new Mammal("Raccoon", 1758));
        animalList.add(new Mammal("Bigfoot", 2021));

        //call your birds a bunch of times
        animalList.add(new Bird("Pigeon", 1837));
        animalList.add(new Bird("Peacock", 1821));
        animalList.add(new Bird("Toucan", 1758));
        animalList.add(new Bird("Parrot", 1824));
        animalList.add(new Bird("Swan", 1758));

        //call your fish a bunch of times
        animalList.add(new Fish("Salmon", 1758));
        animalList.add(new Fish("Catfish", 1817));
        animalList.add(new Fish("Perch", 1758));

        // List all animals in descending order by year named

        // List all the animals alphabetically

        //List all the animals order by how they move

        //List only those animals the breath with lungs

        //List only those animals that breath with lungs and were named in 1758

        //List only those animals that lay eggs and breath with lungs

        //List alphabetically only those animals that were named in 1758

        //For the list of animals, list alphabetically those animals that are mammals
    }
}
