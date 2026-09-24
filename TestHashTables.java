import java.util.HashMap;

public class TestHashTables
{
    private static final int TEN = 10;

    private static enum greek {ALPHA, BETA, GAMMA};
    private static enum days {MON, TUE, WED, THU, FRI, SAT, SUN};

    private static HashMap<Integer, Boolean> h1 = new HashMap<>();
    private static HashMap<greek, Integer> h2 = new HashMap<>();
    private static HashMap<Character, HashMap<Boolean, Double>> h3 = new HashMap<>();
    private static HashMap<Integer, Double> u1 = new HashMap<>();
    private static HashMap<Integer, Boolean> u2 = new HashMap<>();
    private static HashMap<days, greek> u3 = new HashMap<>();

    public static void main(String[] args)
    {
        System.out.println("Done!");
    }
}
