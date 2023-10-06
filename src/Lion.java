public class Lion extends Animal{
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    String sound() {
        return "Rrr...";
    }
}
