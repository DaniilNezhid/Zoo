import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> listAnimals = new ArrayList<>();
    void addAnimal(Animal animal){
        listAnimals.add(animal);
    }
    void removeAnimal(Animal animal){
        listAnimals.remove(animal);
    }
    void makeSound(){
        for (Animal animal : listAnimals) {
            System.out.println(animal.toString() + " " + animal.sound());
        }
    }
    public ArrayList<Animal> getAnimalsByAge(int age){
        ArrayList<Animal> animals = new ArrayList<>();
        for(Animal animal : listAnimals) {
            if(animal.getAge() == age){
                animals.add(animal);
                System.out.println(animal + " Has been found by age " + age);
            }
        }
        return animals;
    }
}
