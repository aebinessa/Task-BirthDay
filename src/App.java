import java.util.Calendar;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your birth year:");
        int birthYear = myScanner.nextInt();

        System.out.println("Enter your birth month:");
        int birthMonth = myScanner.nextInt();

        System.out.println("Enter your birth day of the month:");
        int birthDay = myScanner.nextInt();

        myScanner.close();

        Calendar todaysDate = Calendar.getInstance();

        Calendar userBirthDate = Calendar.getInstance();

        userBirthDate.set(birthYear, birthMonth - 1, birthDay);

        int age = todaysDate.get(Calendar.YEAR) - userBirthDate.get(Calendar.YEAR);

        if (todaysDate.get(Calendar.DAY_OF_YEAR) < userBirthDate.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }
        System.out.println("Your age is: " + age + " years");

    }
}
