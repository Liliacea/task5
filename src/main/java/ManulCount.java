import java.util.ArrayList;
import java.util.List;

public class ManulCount {

    static class Child {
        int number;
        List<Child> friends;
        long count;

        public Child(int number) {
            this.number = number;
            this.friends = new ArrayList<>();
        }
    }
}
