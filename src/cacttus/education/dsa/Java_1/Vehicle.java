package cacttus.education.dsa.Java_1;

public class Vehicle {
    private String brand; // a ndrohet brand PO JO
    private String model; // a ndrohet modeli
    private int year; // a ndrohet year
    private int nrOfWheels; //
    private int kilometerage;
    private String plateNr;

    //te gjitha fields/fushat/data/attributet qe nuk ndrohen  eshte mire me u marr nga konsturktori
    // dhe me qene readonly (get)

    public void setKilometerage(int kilometerage) {
        this.kilometerage = kilometerage;
    }

    public void setPlateNr(String plateNr) {
        this.plateNr = plateNr;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getNrOfWheels() {
        return nrOfWheels;
    }

    public int getKilometerage() {
        return kilometerage;
    }

    public String getPlateNr() {
        return plateNr;
    }

}
