
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.*;
import java.time.Duration;

class ex01 {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " is: " + factorial);*/
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + currentDateTime);
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        //System.out.println("Formatted date and time: " + currentDateTime.format(formatter));
        LocalDateTime futureDateTime = LocalDateTime.now().plusDays(5).plusHours(3).plusMinutes(30);
        System.out.println("Future date and time: " + futureDateTime);
        //DateTimeFormatter futureFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        //System.out.println("Formatted future date and time: " + futureDateTime.format(futureFormatter));
        Duration duration = Duration.between(currentDateTime, futureDateTime);
        System.out.println("Duration between current and future date and time: " + duration.toDays() + " days, " + duration.toHoursPart() + " hours, " + duration.toMinutesPart() + " minutes.");
    }
}
