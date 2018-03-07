package animals;

public class Cat extends Pet {

    public Cat(int id, int age, int weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    @Override
    public void voice() {
        System.out.println(getVoice() + "Meow...");
    }
}
