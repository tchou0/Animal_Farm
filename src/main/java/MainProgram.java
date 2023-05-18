import java.util.List;

public class MainProgram {




    public static void main(String[] args) {
        AnimalFarm myFarm = new AnimalFarm();
//        System.out.println(myFarm);
        List<Animal> animalList = myFarm.getAnimals();
        System.out.println(ColorCodes.ANSI_YELLOW +"\n==================== Welcome to My Animal Farm ====================="+ ColorCodes.ANSI_RESET);
        System.out.println();
        for (Animal a : animalList) {
            System.out.printf(ColorCodes.TEXT_CYAN+"My name is %s \n"+ ColorCodes.TEXT_RESET, a.getName());
            System.out.printf(ColorCodes.TEXT_PURPLE+"I am a %s \n"+
                    ColorCodes.TEXT_RESET, a.getSpecies());
            a.makeNoise();
            a.eatUnderYonderTree();
            System.out.println();
            System.out.println(ColorCodes.ANSI_YELLOW+"-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-"+ ColorCodes.ANSI_RESET);
        }

    }
}
