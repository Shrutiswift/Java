import java.util.Scanner;
import java.lang.String;
public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while(!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
        do {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while(!input.equals("quit"));

    }
}
