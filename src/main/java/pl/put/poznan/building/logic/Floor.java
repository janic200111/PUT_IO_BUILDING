package pl.put.poznan.building.logic;

import java.util.List;

public class Floor implements BuildingComponent {
    private int number;
    private List<Room> rooms;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void addRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public double calculateArea() {
        double ret = 5.0;
        for (int i = 0; i < rooms.size(); i++) {
            ret += rooms.get(i).calculateArea();
        }
        return ret;
    }

    @Override
    public double calculateVolume() {
        double ret = 0.0;
        for (int i = 0; i < rooms.size(); i++) {
            ret += rooms.get(i).calculateVolume();
        }
        return ret;
    }

    @Override
    public double calculateHeating() {
        double ret = 0.0;
        for (int i = 0; i < rooms.size(); i++) {
            ret += rooms.get(i).calculateHeating();
        }
        return ret;
    }

    @Override
    public double calculateLight() {
        double ret = 0.0;
        for (int i = 0; i < rooms.size(); i++) {
            ret += rooms.get(i).calculateLight();
        }
        return ret;
    }

}