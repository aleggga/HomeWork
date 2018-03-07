package animals;

public abstract class Animal {
    private int id;
    private int age;
    private int weight;
    private String color;
    private String voice = "Hello, ";

    public Animal(int id, int age, int weight, String color) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public abstract void voice();

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    String getVoice() {
        return voice;
    }
}
