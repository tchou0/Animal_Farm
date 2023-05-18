public class Cat extends Animal {

    public Cat(AnimalType species, String name) {
        super(species, name);
    }

    @Override
    public void makeNoise() {
        System.out.println(ColorCodes.RED_BOLD_BRIGHT+"Meow ~~~~~"+ColorCodes.ANSI_RESET);
    }

}
