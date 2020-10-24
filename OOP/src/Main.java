import javax.management.InvalidAttributeValueException;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        try {
            porsche.setModel("CARRERA");
        } catch (InvalidAttributeValueException e) {
            System.out.println(e);
        }
        System.out.println(porsche.getModel());

        Dog cockerSpaniel = new Dog("Sammy", 1, 10, 10, 10);
        cockerSpaniel.setLevel(Dog.TrainingLevel.ADVANCE);
        System.out.println(cockerSpaniel.getLevel());

        cockerSpaniel.eat();

    }
}
