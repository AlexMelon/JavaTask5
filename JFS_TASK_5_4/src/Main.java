import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth year (YYYY): ");
        int year = scanner.nextInt();

        System.out.print("Enter your birth month (MM): ");
        int month = scanner.nextInt();

        System.out.print("Enter your birth day (DD): ");
        int day = scanner.nextInt();

        LocalDate birthDate = LocalDate.of(year, month, day);

        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(birthDate, currentDate);

        System.out.println("You are " + age.getYears() + " years, "
                + age.getMonths() + " months, and "
                + age.getDays() + " days.");

    }
}