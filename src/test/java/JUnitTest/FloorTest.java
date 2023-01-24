package JUnitTest;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
import pl.put.poznan.building.logic.Floor;
import pl.put.poznan.building.logic.Room;
import java.util.ArrayList;
import java.util.List;


public class FloorTest {
    @Test
    public void testCalculateArea() {
        Floor floor = new Floor();
        Room room1 = new Room();
        Room room2 = new Room();
        room1.setArea("10");
        room2.setArea("20");
        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        floor.addRooms(rooms);
        double expected = room1.calculateArea() + room2.calculateArea();
        double result = floor.calculateArea();
        Assertions.assertEquals(expected, result, 0.0);
    }
    @Test
    public void testCalculateAreRaw() {
        Floor floor = new Floor();
        Room room1 = new Room();
        Room room2 = new Room();
        room1.setArea("10");
        room2.setArea("20");
        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        floor.addRooms(rooms);
        double expected = 30;
        double result = floor.calculateArea();
        Assertions.assertEquals(expected, result, 0.0);
    }
    @Test
    public void testCalculateVolumeRaw(){
        Floor floor = new Floor();
        Room room1 = new Room();
        Room room2 = new Room();
        room1.setCube("10");
        room2.setCube("20");
        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        floor.addRooms(rooms);
        double expected = room1.calculateVolume()+ room2.calculateVolume();
        double result = floor.calculateVolume();
        Assertions.assertEquals(expected, result, 0.0);
    }
    @Test
    public void testCalculateVolume(){
        Floor floor = new Floor();
        Room room1 = new Room();
        Room room2 = new Room();
        room1.setCube("10");
        room2.setCube("20");
        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        floor.addRooms(rooms);
        double expected = 30;
        double result = floor.calculateVolume();
        Assertions.assertEquals(expected, result, 0.0);
    }
    @Test
    public void testCalculateHeating(){
        Floor floor = new Floor();
        Room room1 = new Room();
        Room room2 = new Room();
        room1.setHeating("20");
        room2.setHeating("50");
        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        floor.addRooms(rooms);
        double expected = room1.calculateHeating()+ room2.calculateHeating();
        double result = floor.calculateHeating();
        Assertions.assertEquals(expected, result, 0.0);
    }
    @Test
    public void testCalculateHeatingRaw(){
        Floor floor = new Floor();
        Room room1 = new Room();
        Room room2 = new Room();
        room1.setHeating("20");
        room2.setHeating("50");
        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        floor.addRooms(rooms);
        double expected = 70;
        double result = floor.calculateHeating();
        Assertions.assertEquals(expected, result, 0.0);
    }
    @Test
    public void testCalculateLighting(){
        Floor floor = new Floor();
        Room room1 = new Room();
        Room room2 = new Room();
        room1.setLight("20");
        room2.setLight("231");
        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        floor.addRooms(rooms);
        double expected = room1.calculateLight()+ room2.calculateLight();
        double result = floor.calculateLight();
        Assertions.assertEquals(expected, result, 0.0);
    }
    @Test
    public void testCalculateLightingRaw(){
        Floor floor = new Floor();
        Room room1 = new Room();
        Room room2 = new Room();
        room1.setLight("20");
        room2.setLight("231");
        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        floor.addRooms(rooms);
        double expected = 251;
        double result = floor.calculateLight();
        Assertions.assertEquals(expected, result, 0.0);
    }
    @Test
    public void testRoomsOverHeatingLimit(){
        Floor floor = new Floor();
        Room room1 = new Room();
        Room room2 = new Room();
        room1.setHeating("20");
        room2.setHeating("231");
        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        floor.addRooms(rooms);
        List<Integer> rooms_result = floor.getRoomsOverHeatingLimit(30);
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        Assertions.assertEquals(expected, rooms_result);
    }

}

