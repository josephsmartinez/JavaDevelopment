import javax.management.InvalidAttributeValueException;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) throws InvalidAttributeValueException {
        String vaildModel = model.toLowerCase();
        if (vaildModel.equals("911") || vaildModel.equals("carrera")) {
            this.model = model;
        } else {
            throw new InvalidAttributeValueException();
        }
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
