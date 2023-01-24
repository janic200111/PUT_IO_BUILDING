package JUnitTest;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
import pl.put.poznan.building.logic.Building;
import pl.put.poznan.building.logic.Floor;
import pl.put.poznan.building.logic.Room;

import java.util.ArrayList;
import java.util.List;

public class BuildingTest {
    @Test
    public void testCalculateArea() {
        Floor floor = new Floor();
        Room room1 = new Room();
        Room room2 = new Room();
        room1.setArea("10");
        room2.setArea("20");

        Floor floor2 = new Floor();
        Room room3 = new Room();
        Room room4 = new Room();
        room4.setArea("21");
        room3.setArea("42");

        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        floor.addRooms(rooms);

        List<Room> rooms2 = new ArrayList<>();
        rooms2.add(room3);
        rooms2.add(room4);
        floor2.addRooms(rooms2);

        List<Floor> floors = new ArrayList<>();
        floors.add(floor);
        floors.add(floor2);

        Building building = new Building();
        building.setFloors(floors);
        double expected = floor2.calculateArea() + floor.calculateArea();
        double result = building.calculateArea();
        Assertions.assertEquals(expected, result, 0.0);
    }
    @Test
    public void testCalculateAreaRaw() {
        Floor floor = new Floor();
        Room room1 = new Room();
        Room room2 = new Room();
        room1.setArea("10");
        room2.setArea("20");

        Floor floor2 = new Floor();
        Room room3 = new Room();
        Room room4 = new Room();
        room4.setArea("21");
        room3.setArea("42");

        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        floor.addRooms(rooms);

        List<Room> rooms2 = new ArrayList<>();
        rooms2.add(room3);
        rooms2.add(room4);
        floor2.addRooms(rooms2);

        List<Floor> floors = new ArrayList<>();
        floors.add(floor);
        floors.add(floor2);

        Building building = new Building();
        building.setFloors(floors);
        double expected = 93;
        double result = building.calculateArea();
        Assertions.assertEquals(expected, result, 0.0);
    }

    @Test
    public void testCalculateVolume() {
        Floor floor = new Floor();
        Room room1 = new Room();
        Room room2 = new Room();
        room1.setCube("10");
        room2.setCube("20");

        Floor floor2 = new Floor();
        Room room3 = new Room();
        Room room4 = new Room();
        room4.setCube("21");
        room3.setCube("42");

        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        floor.addRooms(rooms);

        List<Room> rooms2 = new ArrayList<>();
        rooms2.add(room3);
        rooms2.add(room4);
        floor2.addRooms(rooms2);

        List<Floor> floors = new ArrayList<>();
        floors.add(floor);
        floors.add(floor2);

        Building building = new Building();
        building.setFloors(floors);
        double expected = floor2.calculateVolume() + floor.calculateVolume();
        double result = building.calculateVolume();
        Assertions.assertEquals(expected, result, 0.0);
    }
    @Test
    public void testCalculateVolumeRaw() {
        Floor floor = new Floor();
        Room room1 = new Room();
        Room room2 = new Room();
        room1.setCube("10");
        room2.setCube("20");

        Floor floor2 = new Floor();
        Room room3 = new Room();
        Room room4 = new Room();
        room4.setCube("21");
        room3.setCube("42");

        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        floor.addRooms(rooms);

        List<Room> rooms2 = new ArrayList<>();
        rooms2.add(room3);
        rooms2.add(room4);
        floor2.addRooms(rooms2);

        List<Floor> floors = new ArrayList<>();
        floors.add(floor);
        floors.add(floor2);

        Building building = new Building();
        building.setFloors(floors);
        double expected = 93;
        double result = building.calculateVolume();
        Assertions.assertEquals(expected, result, 0.0);
    }
    @Test
    public void testCalculateHeating() {
        Floor floor = new Floor();
        Room room1 = new Room();
        Room room2 = new Room();
        room1.setHeating("10");
        room2.setHeating("20");

        Floor floor2 = new Floor();
        Room room3 = new Room();
        Room room4 = new Room();
        room4.setHeating("21");
        room3.setHeating("42");

        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        floor.addRooms(rooms);

        List<Room> rooms2 = new ArrayList<>();
        rooms2.add(room3);
        rooms2.add(room4);
        floor2.addRooms(rooms2);

        List<Floor> floors = new ArrayList<>();
        floors.add(floor);
        floors.add(floor2);

        Building building = new Building();
        building.setFloors(floors);
        double expected = floor2.calculateHeating() + floor.calculateHeating();
        double result = building.calculateHeating();
        Assertions.assertEquals(expected, result, 0.0);
    }
    @Test
    public void testCalculateHeatingRaw() {
        Floor floor = new Floor();
        Room room1 = new Room();
        Room room2 = new Room();
        room1.setHeating("10");
        room2.setHeating("20");

        Floor floor2 = new Floor();
        Room room3 = new Room();
        Room room4 = new Room();
        room4.setHeating("21");
        room3.setHeating("42");

        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        floor.addRooms(rooms);

        List<Room> rooms2 = new ArrayList<>();
        rooms2.add(room3);
        rooms2.add(room4);
        floor2.addRooms(rooms2);

        List<Floor> floors = new ArrayList<>();
        floors.add(floor);
        floors.add(floor2);

        Building building = new Building();
        building.setFloors(floors);
        double expected = 93;
        double result = building.calculateHeating();
        Assertions.assertEquals(expected, result, 0.0);
    }
    @Test
    public void testCalculateLight() {
        Floor floor = new Floor();
        Room room1 = new Room();
        Room room2 = new Room();
        room1.setLight("10");
        room2.setLight("20");

        Floor floor2 = new Floor();
        Room room3 = new Room();
        Room room4 = new Room();
        room4.setLight("21");
        room3.setLight("42");

        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        floor.addRooms(rooms);

        List<Room> rooms2 = new ArrayList<>();
        rooms2.add(room3);
        rooms2.add(room4);
        floor2.addRooms(rooms2);

        List<Floor> floors = new ArrayList<>();
        floors.add(floor);
        floors.add(floor2);

        Building building = new Building();
        building.setFloors(floors);
        double expected = floor2.calculateLight() + floor.calculateLight();
        double result = building.calculateLight();
        Assertions.assertEquals(expected, result, 0.0);
    }
    @Test
    public void testCalculateLightRaw() {
        Floor floor = new Floor();
        Room room1 = new Room();
        Room room2 = new Room();
        room1.setLight("10");
        room2.setLight("20");

        Floor floor2 = new Floor();
        Room room3 = new Room();
        Room room4 = new Room();
        room4.setLight("21");
        room3.setLight("42");

        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        floor.addRooms(rooms);

        List<Room> rooms2 = new ArrayList<>();
        rooms2.add(room3);
        rooms2.add(room4);
        floor2.addRooms(rooms2);

        List<Floor> floors = new ArrayList<>();
        floors.add(floor);
        floors.add(floor2);

        Building building = new Building();
        building.setFloors(floors);
        double expected = 93;
        double result = building.calculateLight();
        Assertions.assertEquals(expected, result, 0.0);
    }
}