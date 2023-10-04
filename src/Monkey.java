public class Monkey extends Animal implements Climber{
    @Override
    public void climb(){
        System.out.println("Climbing");
    }
    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    String Sound() {
        return "U u u...";
    }
}
