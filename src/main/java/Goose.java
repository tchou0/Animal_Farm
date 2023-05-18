public class Goose extends Animal{
    public Goose(AnimalType species, String name) {
        super(species, name);
    }
    @Override
    public void makeNoise() {
        System.out.println(ColorCodes.RED_BOLD_BRIGHT+"Hooonk ~~~~~"+ColorCodes.ANSI_RESET);
    }
}
