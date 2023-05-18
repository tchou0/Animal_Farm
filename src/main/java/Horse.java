public class Horse extends Animal{
    public Horse(AnimalType species, String name) {
        super(species, name);
    }
    @Override
    public void makeNoise() {
        System.out.println(ColorCodes.RED_BOLD_BRIGHT+"Nay ~~~~~~"+ColorCodes.CYAN_BOLD_BRIGHT);
    }
}
