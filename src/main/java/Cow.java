public class Cow extends Animal {

    public Cow(AnimalType species, String name) {
        super(species, name);
    }
    @Override
    public void makeNoise() {
        System.out.println(ColorCodes.RED_BOLD_BRIGHT+"Mooo ~~~~~"+ColorCodes.ANSI_RESET);
    }
}
