package animals;

public abstract class Wild extends Animal {

    public Wild(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }

    private boolean isPredator;
    private String voice = "I am a wild animal";
    private String voicePredator = " and I am angry";


    boolean isPredator() {
        return isPredator;
    }

    private void setPredator(boolean predator) {
        isPredator = predator;
    }

    public void printIsPredator() {
        System.out.println(getClass().getSimpleName() + " is predator: " + isPredator);
    }

    @Override
    public void voice() {
        System.out.println(getVoice());
    }

    @Override
    String getVoice() {
        if (!isPredator) {
            return (super.getVoice() + this.voice);
        } else {
            return (super.getVoice() + this.voice + voicePredator);
        }
    }
}
