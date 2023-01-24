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
}

