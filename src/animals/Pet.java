package animals;

public abstract class Pet extends Animal {

    private String name;
    private boolean isVaccinated;
    private String voice = "my name is ";


    public Pet(int age, double weight, String color, String name, boolean isVaccinated) {
        super(age, weight, color);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }

    public void printName() {
        System.out.println(getClass().getSimpleName() + " name: " + name);
    }

    public void printIsVaccinated() {
        System.out.println(getClass().getSimpleName() + " isVaccinated: " + isVaccinated);
    }

    String getName() {
        return name;
    }

    boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    @Override
    String getVoice() {
        return super.getVoice() + voice + name;
    }

    @Override
    public void voice() {
        System.out.println(getVoice());
    }
}
