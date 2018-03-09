package animals;

public class Cat extends Pet {

    public Cat(int age, double weight, String color, String name, boolean isVaccinated) {
        super(age, weight, color, name, isVaccinated);
    }

    @Override
    String getVoice() {
        return super.getVoice() + " myau...";
    }

    @Override
    public void voice() {
        System.out.println(getVoice());
    }
}
