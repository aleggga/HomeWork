package animals;

public abstract class Pet extends Animal {

    private String name;
    private boolean isVaccinated;
    private String voice = super.getVoice() + "my name is" + name;


    public Pet(int id, int age, int weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }

    public String getName() {
        return name;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    @Override
    public void voice() {
        System.out.println(voice);
    }
}
