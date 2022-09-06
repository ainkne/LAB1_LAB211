import java.util.Scanner;

public class Validation {
    public static int checkInt(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, try again!");
                System.out.println(">> ");
            }
        }
    }
}
