package animals;

public class Start {
    public static void main(String[] args) {
        Cat cat = new Cat(1,2,3,"black", "Vas'ka", true);
        cat.voice();
        cat.getVoice();
        cat.printAge();
        cat.printColor();
        cat.printId();
        cat.printWeight();
        cat.printName();
        cat.printIsVaccinated();
        cat.setVaccinated(false);
        cat.printIsVaccinated();

        Volf volf = new Volf(27,4,23,"grey", true);
        //volf.setPredator(false);
        volf.printAge();
        volf.printColor();
        volf.printId();
        volf.printWeight();
        volf.voice();
        volf.printIsPredator();

        Crocodile crocodile = new Crocodile(12, 4, 56, "green", true);
        crocodile.printAge();
        crocodile.printColor();
        crocodile.printId();
        crocodile.printIsPredator();
        crocodile.printWeight();

        Dog dog = new Dog(23, 1, 0.5, "brown", "Sam", false);
        dog.voice();
        dog.printAge();
        dog.printColor();
        dog.printId();
        dog.printIsVaccinated();
        dog.printName();dog.printWeight();

        Fish fish = new Fish(213, 6, 0.01,"golden", "", false, "gurami");
        fish.move();
        fish.voice();
        fish.printColor();
        fish.printAge();
        fish.printId();
        fish.printIsVaccinated();
        fish.printName();
        fish.printWeight();

        GuideDog guideDog = new GuideDog(232323, 9, 14.233, "black", "Bob",
                true, true);
        guideDog.printAge();
        guideDog.printColor();
        guideDog.printId();
        guideDog.printIsVaccinated();
        guideDog.printName();
        guideDog.printWeight();
        guideDog.takeOwnerHome();
        guideDog.voice();

        
    }
}
