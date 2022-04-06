import java.util.List;

public class SpaceCraftSolution {
    public static int calculateAmountOfFuel(int mass) {
        return (mass / 3) - 2;
    }

    public static int calculateTotalAmountOfFuel(List<Integer> massList) {
        return massList.stream().mapToInt(SpaceCraftSolution::calculateAmountOfFuel).sum();
    }
}
