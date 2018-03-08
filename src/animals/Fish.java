package animals;

public class Fish extends Pet {

    private String type;

    public Fish(int id, int age, double weight, String color, String name, boolean isVaccinated, String type) {
        super(id, age, weight, color, name, isVaccinated);
        this.type = type;
    }

    @Override
    public void voice() {
        System.out.println(getVoice() + " ....");
    }

    void move() {
        System.out.println("fish is moving");
    }
}
