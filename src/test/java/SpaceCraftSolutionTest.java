import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SpaceCraftSolutionTest {

    @Test
    void checkOnCalculateAmountOfFuelMethod() {

        //Given
        int mass = 12;
        //when
        int fuelAmount =SpaceCraftSolution.calculateAmountOfFuel(mass);
        //then
        assertEquals(2, fuelAmount);

    }

    @Test
    void checkOnCalculateTotalAmountOfFuelMethod() {
        //Given
        List<Integer> massList = Arrays.asList(12,14);
        //when
        int totalAmountOfFuel = SpaceCraftSolution.calculateTotalAmountOfFuel(massList);
        //then
        assertEquals(4,totalAmountOfFuel);
    }

    @Test
    void checkOnCalculateTotalAmountOfFuelWithReduceMethod(){
        //Given
        List<Integer> massList = Arrays.asList(12,14);
        //when
        int totalAmountOfFuel = SpaceCraftSolutionWithReduceMethod.calculateTotalAmountOfFuel(massList);
        //then
        assertEquals(4,totalAmountOfFuel);
    }
}