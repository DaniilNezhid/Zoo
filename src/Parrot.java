public class Parrot extends Animal{
    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    String sound() {
        return "Chirik";
    }
}
