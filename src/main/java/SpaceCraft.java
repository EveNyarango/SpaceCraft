import java.util.List;

public class SpaceCraft {
    public static int calculateAmountOfFuel(int mass) {
        return (mass / 3) - 2;
    }

    public int addAllMasses(List<Integer> massList) {
        int totalFuel = 0;
        for (Integer mass : massList) {
            totalFuel += calculateAmountOfFuel(mass);
        }
        return totalFuel;
    }
}
