import java.util.List;

public class SpaceCraftSolutionWithReduceMethod {
    public static int calculateAmountOfFuel(int mass) {
        return (mass / 3) - 2;
    }

    public static int calculateTotalAmountOfFuel(List<Integer> massList) {
        return massList
                .stream()
                .map(SpaceCraftSolutionWithReduceMethod::calculateAmountOfFuel)
                .reduce(0, Integer::sum);
    }
}
