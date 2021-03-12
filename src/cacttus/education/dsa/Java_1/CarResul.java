package cacttus.education.dsa.Java_1;

public class CarResul {

    private String carBrand;

    private String carModel;

    private int year;

    private String color;

    private int gears;

    private int horsePower;

    private double oneToHundred;

    private float price;

    private char gearShifter;

    private String engine;

    private double litersPerHundred;

    public CarResul(String carBrand, String carModel, int year) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.year = year;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public int getGears() {
        return gears;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public double getOneToHundred() {
        return oneToHundred;
    }

    public float getPrice() {
        return price;
    }

    public char getGearShifter() {
        return gearShifter;
    }

    public String getEngine() {
        return engine;
    }

    public double getLitersPerHundred() {
        return litersPerHundred;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setOneToHundred(double oneToHundred) {
        this.oneToHundred = oneToHundred;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setLitersPerHundred(double litersPerHundred) {
        this.litersPerHundred = litersPerHundred;
    }
}
//dashboard-in e vetures AMG te punuar JAVA