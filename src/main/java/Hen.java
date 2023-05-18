public class Hen extends Animal{
    public Hen(AnimalType species, String name) {
        super(species, name);
    }
    @Override
    public void makeNoise() {
        System.out.println(ColorCodes.RED_BOLD_BRIGHT+"cluck-cluck-cluck ~~~~~"+ColorCodes.ANSI_RESET);
    }
}
