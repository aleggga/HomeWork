package animals;

public class Start {
    public static void main(String[] args) {
        Cat cat = new Cat(1,2,3,"black", "Vas'ka", true);
        cat.voice();
        System.out.println(cat.getAge());
        System.out.println(cat.getColor());
        System.out.println(cat.getId());
        System.out.println(cat.getWeight());
        System.out.println(cat.getName());
        System.out.println(cat.isVaccinated());
        cat.setVaccinated(false);
        System.out.println(cat.isVaccinated());

        Volf volf = new Volf(27,4,23,"grey", true);
        //volf.setPredator(false);
        System.out.println(volf.getAge());
        System.out.println(volf.getColor());
        System.out.println(volf.getId());
        System.out.println(volf.getWeight());
        volf.voice();
        System.out.println(volf.isPredator());

    }
}
