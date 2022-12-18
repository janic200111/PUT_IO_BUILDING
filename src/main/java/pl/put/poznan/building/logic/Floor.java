package pl.put.poznan.building.logic;

import java.util.List;

public class Floor {
    private int number;
    private List<Person> people;
    private String monthlyPowerUsage;
    private int area;
    private String department;
    private String administrator;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public String getMonthlyPowerUsage() {
        return monthlyPowerUsage;
    }

    public void setMonthlyPowerUsage(String monthlyPowerUsage) {
        this.monthlyPowerUsage = monthlyPowerUsage;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAdministrator() {
        return administrator;
    }

    public void setAdministrator(String administrator) {
        this.administrator = administrator;
    }
}
