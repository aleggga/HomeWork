package animals;

public class GuideDog extends Pet {

    private boolean isTrained;

    public GuideDog(int id, int age, double weight, String color, String name, boolean isVaccinated, boolean isTrained) {
        super(id, age, weight, color, name, isVaccinated);
        this.isTrained = isTrained;
    }

    public void takeOwnerHome() {
        System.out.println("Let's go home man");
    }

    @Override
    public void voice() {
        System.out.println(getVoice() + " I can take you home.");
    }
}
