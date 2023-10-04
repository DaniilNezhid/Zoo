import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private ArrayList<Animal> ListAnimals = new ArrayList<>();
    void addAnimal(Animal animal){
        ListAnimals.add(animal);
    }
    void removeAnimal(Animal animal){
        ListAnimals.remove(animal);
    }
    void makeSound(){
        for (Animal animal : ListAnimals) {
            System.out.println(animal.toString() + " " + animal.Sound());
        }
    }
    public ArrayList<Animal> getAnimalsByAge(int age){
        ArrayList<Animal> animals = new ArrayList<>();
        for(Animal animal : ListAnimals) {
            if(animal.getAge() == age){
                animals.add(animal);
            }
        }
        return animals;
    }
}
