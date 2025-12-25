package xeOTo;

public class Car {
    private String name;
    private String engine;
    private int numberOfCars;
    public static int serialNumber;

    public Car(String name, String engine, int numberOfCars) {
        this.name = name;
        this.engine = engine;
        this.numberOfCars = numberOfCars;
        serialNumber++;
    }
    // name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // engine
    public String getEngine() {
        return engine;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    // numberOfCars
    public int getNumberOfCars() {
        return numberOfCars;
    }
    public void setNumberOfCars(int numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    void display() {
        System.out.println(serialNumber +
                        ". Dòng xe: " + name +
                        "; Động cơ: " + engine +
                        "; Số lượng: " + numberOfCars);
    }
}
