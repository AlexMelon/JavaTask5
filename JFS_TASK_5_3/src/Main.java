import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create a List to store student names
        List<String> studentNames = new ArrayList<>();

        studentNames.add("Alice");
        studentNames.add("Alex");
        studentNames.add("Venkatesh");
        studentNames.add("Diana");
        studentNames.add("Amalie");
        studentNames.add("Fiona");
        studentNames.add("George");
        studentNames.add("Anne");
        studentNames.add("Ian");
        studentNames.add("Alwin");

        List<String> giftingStudents = studentNames.stream().filter(s -> s.startsWith("A")).toList();

        System.out.println("Names Starts with A :" + giftingStudents);
    }
}