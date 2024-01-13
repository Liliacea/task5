
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int child = scanner.nextInt();
        int pair = scanner.nextInt();
        int cases = scanner.nextInt();

        int[] manulsCount = new int[child];

        for (int i = 0; i < child; i++) {
            manulsCount[i] = scanner.nextInt();
        }

        List<List<Integer>> friends = new ArrayList<>();
        for (int i = 0; i < child; i++) {
            friends.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < pair; i++) {
            int v = scanner.nextInt();
            int u = scanner.nextInt();
            friends.get(v - 1).add(u - 1);
            friends.get(u - 1).add(v - 1);
        }

        for (int i = 0; i < cases; i++) {

            String type = scanner.next();
            int v = scanner.nextInt();
            if (type.equals("?")) {

                System.out.println(manulsCount[v - 1]);
            } else {

                int x = scanner.nextInt();
                for (int friend : friends.get(v - 1)) {
                    manulsCount[friend] += x;
                }
            }
        }
    }
}


