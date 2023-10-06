public abstract class Animal {

// Убрать кавычки и цифры
    private String name = "";
    private int age = 0;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

//    методы называются с маленькой буквы
    abstract String Sound();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
