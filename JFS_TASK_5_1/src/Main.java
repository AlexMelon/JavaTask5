import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("aBc", "d", "ef");
        List<String> upperCaseNames = names.map(String::toUpperCase).collect(Collectors.toList());

        System.out.println("UpperCaseNames are : " + upperCaseNames);
    }
}