package JUnitTest;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import pl.put.poznan.building.logic.Floor;
import pl.put.poznan.building.logic.Room;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FloorTestMock {

    @Test
    public void testCalculateArea() {
        List<Room> mockObjects = new ArrayList<Room>();
    
        Random rand = new Random();
        double rangeMin = 10.0, rangeMax = 100.0;
        double expected = 0.0;
        int numberOfSamples = 10;
        
        for (int i=0; i<numberOfSamples; i++) {
            mockObjects.add(mock(Room.class));

            double randomValue = rangeMin + (rangeMax - rangeMin) * rand.nextDouble();
            when(mockObjects.get(i).calculateArea()).thenReturn(randomValue);
            expected += randomValue;
        }
        
    
        Floor testedObject = new Floor();
        testedObject.addRooms(mockObjects);
        double result = testedObject.calculateArea();
    
        for (int i=0; i<numberOfSamples; i++) verify(mockObjects.get(i)).calculateArea();
        
        assertEquals(expected, result);
    }
}
