import java.util.ArrayList;
import java.util.List;

public class AnimalFarm {


    // Member variables
    private List animals = new ArrayList();

    public List getAnimals() {
        return animals;
    }

    // Constructor
    public AnimalFarm() {

        animals.add(new Cat(AnimalType.CAT, "Benny"));
        animals.add(new Duck(AnimalType.DUCK, "Susan"));
        animals.add(new Goose(AnimalType.GOOSE, "Oliver"));
        animals.add(new Hen(AnimalType.HEN, "Henry"));
        animals.add(new Horse(AnimalType.PIG, "Buster"));
        animals.add(new Cow(AnimalType.COW, "Sweet Melissa"));
        animals.add(new Pig(AnimalType.PIG, "Theosophist"));
    }

}


