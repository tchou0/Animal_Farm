public class Duck extends Animal{
    public Duck(AnimalType species, String name) {
        super(species, name);
    }
    @Override
    public void makeNoise() {
        System.out.println(ColorCodes.RED_BOLD_BRIGHT+"Quack ~~~~"+ColorCodes.ANSI_RESET);
    }
}
