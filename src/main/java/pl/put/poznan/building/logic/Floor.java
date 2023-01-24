package pl.put.poznan.building.logic;

import java.util.ArrayList;
import java.util.List;

public class Floor implements BuildingComponent{
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

    public List<Room> getRooms() {
        return rooms;
    }

    public int getNumberOfRooms() {
        return this.rooms.size();
    }

    @Override
    public double calculateArea() {
        double ret = 0.0;
        for (int i=0; i<rooms.size(); i++) {
            ret += rooms.get(i).calculateArea();
        }
        return ret;
    }

    @Override
    public double calculateVolume() {
        double ret = 0.0;
        for (int i=0; i<rooms.size(); i++) {
            ret += rooms.get(i).calculateVolume();
        }
        return ret;
    }

    @Override
    public double calculateHeating() {
        double ret = 0.0;
        for (int i=0; i<rooms.size(); i++) {
            ret += rooms.get(i).calculateHeating();
        }
        return ret;
    }

    @Override
    public double calculateLight() {
        double ret = 0.0;
        for (int i=0; i<rooms.size(); i++) {
            ret += rooms.get(i).calculateLight();
        }
        return ret;
    }

    public List<Integer> getRoomsOverHeatingLimit(double limit){

        List<Integer> bad_rooms = new ArrayList<>();

        for (int i=0; i<rooms.size(); i++) {
            if(this.rooms.get(i).calculateHeating() > limit){
                bad_rooms.add(i);
            }
        }

        return bad_rooms;

    }

}