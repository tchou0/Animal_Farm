public class Pig extends Animal {

    public Pig(AnimalType species, String name) {
        super(species, name);
    }

    @Override
    public void makeNoise() {
        System.out.println(ColorCodes.RED_BOLD_BRIGHT+"Weeee Weeee Weeee ~~~~ "+ColorCodes.ANSI_RESET);
    }

}
