package models;

public class Car {
    private Integer id;
    private String make;
    private String model;
    private Integer year;
    private String color;
    private Integer vin;


    public Car() {
    }

    public Car(String name, String pass, Integer age, String color, Integer vin) {
        this.make = name;
        this.model = pass;
        this.year = age;
        this.color = color;
        this.vin = vin;
    }

    public Car(Integer id, String name, String pass, Integer age, String color, Integer vin) {
        this.id = id;
        this.make = name;
        this.model = pass;
        this.year = age;
        this.color = color;
        this.vin = vin;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return make;
    }

    public void setName(String name) {
        this.make = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Integer getVin() {
        return vin;
    }
    public void setVin(Integer vin) {
        this.vin = vin;
    }

}
