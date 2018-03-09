package animals;

public abstract class Animal {
    private static int id = 0;
    private int age;
    private double weight;
    private String color;
    private String voice = "Hello, ";

    public Animal(int age, double weight, String color) {
        id++;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public abstract void voice();

    String getVoice(){
        return voice;
    }

    int getId() {
        return id;
    }

    int getAge() {
        return age;
    }

    public void printId() {
        System.out.println(getClass().getSimpleName() + " id: " + id);
    }

    public void printAge() {
        System.out.println(getClass().getSimpleName() + " age: " + age);
    }

    double getWeight() {
        return weight;
    }

    String getColor() {
        return color;
    }

    public void printWeight() {
        System.out.println(getClass().getSimpleName() + " weight: " + weight);
    }


    public void printColor() {
        System.out.println(getClass().getSimpleName() + " color: " + color);
    }

}
