package animals;

public class Dog extends Pet {

    public Dog(int age, double weight, String color, String name, boolean isVaccinated) {
        super(age, weight, color, name, isVaccinated);
    }

    @Override
    public void voice() {
        System.out.println(getVoice() + " Woof...");
    }


}
