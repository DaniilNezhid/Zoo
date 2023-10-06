public class Lion extends Animal{
    public Lion(String name, int age) {
        super(name, age);
    }

//    методы с маленькой буквы
    @Override
    String Sound() {
        return "Rrr...";
    }
}
