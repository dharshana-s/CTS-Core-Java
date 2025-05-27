import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaSortingExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Charlie");
        names.add("Alice");
        names.add("Bob");

        System.out.println("Before sorting: " + names);

        Collections.sort(names, (name1, name2) -> name1.compareTo(name2));

        System.out.println("After sorting: " + names);
    }
}
