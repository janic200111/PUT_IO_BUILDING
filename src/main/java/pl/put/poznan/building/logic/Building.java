package pl.put.poznan.building.logic;

import java.util.List;

public class Building {
    private String name;
    private String location;
    private String height;
    private int numberOfFloors;
    private int yearBuilt;
    private int monthlyPowerUsage;
    private List<Floor> floors;
    public int getSumAreaOfBuilding()
    {
        int sum = 0;
        for(Floor fl: floors)
        {
            sum+= fl.getArea();
        }
        return sum;
    }
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

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
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

    public int getMonthlyPowerUsage() {
        return monthlyPowerUsage;
    }

    public void setMonthlyPowerUsage(int monthlyPowerUsage) {
        this.monthlyPowerUsage = monthlyPowerUsage;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }
}