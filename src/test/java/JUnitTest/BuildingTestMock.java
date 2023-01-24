package JUnitTest;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import pl.put.poznan.building.logic.Building;
import pl.put.poznan.building.logic.Floor;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BuildingTestMock {

    @Test
    public void testCalculateArea() {
        List<Floor> mockObjects = new ArrayList<Floor>();
    
        Random rand = new Random();
        double rangeMin = 30.0, rangeMax = 300.0;
        double expected = 0.0;
        int numberOfSamples = 10;
        
        for (int i=0; i<numberOfSamples; i++) {
            mockObjects.add(mock(Floor.class));

            double randomValue = rangeMin + (rangeMax - rangeMin) * rand.nextDouble();
            when(mockObjects.get(i).calculateArea()).thenReturn(randomValue);
            expected += randomValue;
        }
        
    
        Building testedObject = new Building();
        testedObject.setFloors(mockObjects);
        double result = testedObject.calculateArea();
    
        for (int i=0; i<numberOfSamples; i++) verify(mockObjects.get(i)).calculateArea();
        
        assertEquals(expected, result);
    }
}
