import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> emptyStrings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        List<String> nonEmptyStrings = new ArrayList<>();

        for (String str : emptyStrings) {
            if (!str.isEmpty()) {
                nonEmptyStrings.add(str);
            }
        }

        System.out.println("NonEmptyStrings: " + nonEmptyStrings);
    }
}