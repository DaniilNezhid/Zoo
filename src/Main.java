import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Animal lion = new Lion("Leo", 20);
        Animal parrot = new Parrot("Kesha", 30);
        Animal snake = new Snake("Lisa", 12);
        Monkey monkey = new Monkey("Jojo", 12);

        zoo.addAnimal(snake);
        zoo.addAnimal(lion);
        zoo.addAnimal(monkey);
        zoo.addAnimal(parrot);

        zoo.makeSound();

        zoo.removeAnimal(parrot);
        zoo.getAnimalsByAge(12);
        monkey.climb();

    }
}