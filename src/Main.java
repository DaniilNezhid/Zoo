public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
       Lion lion = new Lion("Leo", 20);
       Parrot parrot = new Parrot("Kesha", 30);
       Snake snake = new Snake("Lisa", 12);
       Monkey monkey = new Monkey("Jojo",12);
       zoo.getAnimalsByAge(12);
       parrot.Sound();
       monkey.climb();
       zoo.addAnimal(snake);
       zoo.addAnimal(lion);
       zoo.addAnimal(monkey);
       zoo.makeSound();


    }
}