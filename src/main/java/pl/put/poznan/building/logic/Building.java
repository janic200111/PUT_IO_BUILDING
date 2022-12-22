package pl.put.poznan.building.logic;

import java.util.List;

public class Building implements BuildingComponent {
    private String name;
    private String location;
    private String height;
    private int numberOfFloors;
    private int yearBuilt;
    private int monthlyPowerUsage;
    private List<Floor> floors;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    @Override
    public double calculateArea() {
        double ret = 0.0;
        for (int i = 0; i < this.floors.size(); i++) {
            ret += this.floors.get(i).calculateArea();
        }
        return ret;
    }

    @Override
    public double calculateVolume() {
        double ret = 0.0;
        for (int i = 0; i < this.floors.size(); i++) {
            ret += this.floors.get(i).calculateVolume();
        }
        return ret;
    }

    @Override
    public double calculateHeating() {
        double ret = 0.0;
        for (int i = 0; i < this.floors.size(); i++) {
            ret += this.floors.get(i).calculateHeating();
        }
        return ret;
    }

    @Override
    public double calculateLight() {
        double ret = 0.0;
        for (int i = 0; i < this.floors.size(); i++) {
            ret += this.floors.get(i).calculateLight();
        }
        return ret;
    }
}