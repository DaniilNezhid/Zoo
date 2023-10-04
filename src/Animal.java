public abstract class Animal {
    private String name = "";
    private int age = 0;

    public int getAge() {
        return age;
    }

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    abstract String Sound();
    @Override
    public String toString(){
        return name + " " + age;
    }
}
