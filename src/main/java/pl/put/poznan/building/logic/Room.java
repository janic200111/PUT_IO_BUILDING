package pl.put.poznan.building.logic;

public class Room implements BuildingComponent {
    private int number;
    private double area;
    private double cube;
    private double heating;
    private double light;

    public Room() {

    }

    public void setNumber(String number) {
        this.number = Integer.parseInt(number);
    }

    public void setArea(String area) {
        this.area = Double.parseDouble(area);
    }

    public void setCube(String cube) {
        this.cube = Double.parseDouble(cube);
    }

    public void setHeating(String heating) {
        this.heating = Double.parseDouble(heating);
    }

    public void setLight(String light) {
        this.light = Double.parseDouble(light);
    }

    @Override
    public double calculateArea() {
        return area;
    }

    @Override
    public double calculateVolume() {
        return cube;
    }

    @Override
    public double calculateHeating() {
        return heating;
    }

    @Override
    public double calculateLight() {
        return light;
    }
}