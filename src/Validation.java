import java.util.Scanner;

public class Validation {
    public static int checkInt(String msg){
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println(msg);
                int n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, try again!");
                System.out.println(">> ");
            }
        }
    }
}
