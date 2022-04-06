import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpaceCraftSolutionTest {


    @Test
    void calculateAmountOfFuel() {

        //Given
        int mass = 12;
        //when
        int fuelAmount =SpaceCraftSolution.calculateAmountOfFuel(mass);
        //then
        assertEquals(2, fuelAmount);

    }

    @Test
    void calculateTotalAmountOfFuel() {
    }
}