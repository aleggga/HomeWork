package animals;

public abstract class Wild extends Animal {

    public Wild(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }

    private boolean isPredator;
    private String voice = "I am a wild animal";
    private String voicePredator = " and I am angry";


    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    @Override
    public void voice() {
        if (!isPredator) {
            System.out.println(getVoice() + this.voice);
        } else {
            System.out.println(getVoice() + this.voice + voicePredator);
        }
    }


}
