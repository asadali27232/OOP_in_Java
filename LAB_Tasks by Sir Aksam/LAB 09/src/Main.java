import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StatsComputable[] statsComputable = new StatsComputable[4];

        statsComputable[0]  = new Rectangle("Red", true, 23, 25);
        statsComputable[1] = new Rectangle("Black", false, 100, 250);

        ArrayList<Integer> provincesArea = new ArrayList<Integer>();
        provincesArea.add(400);
        provincesArea.add(600);
        provincesArea.add(500);

        ArrayList<Integer> statesArea = new ArrayList<Integer>();
        statesArea.add(500);
        statesArea.add(600);
        statesArea.add(400);

        statsComputable[2] = new Country("Pakistan", provincesArea, statesArea);
        statsComputable[3] = new Country("Pakistan", provincesArea, statesArea);

        for (int i = 0; i < statsComputable.length; i++) {
            statsComputable[i].computeStats();
            System.out.println(statsComputable[i].toString());
        }

    }
}
