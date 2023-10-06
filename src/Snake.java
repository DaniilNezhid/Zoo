public class Snake extends Animal{
    public Snake(String name, int age) {
        super(name, age);
    }

    @Override
    String sound() {
        return "Sss...";
    }
}
