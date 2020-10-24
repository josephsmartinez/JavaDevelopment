public class Dog extends Animal {
    enum TrainingLevel {
        NONE,
        INTERMEDIATE,
        ADVANCE
    }

    private String breed;
    private TrainingLevel level;

    public Dog(String name, int brain, int body, int size, int weight) {
        super(name, brain, body, size, weight);
    }

    @Override
    public void eat() {
        super.eat();
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public TrainingLevel getLevel() {
        return level;
    }

    public void setLevel(TrainingLevel level) {
        this.level = level;
    }
}
