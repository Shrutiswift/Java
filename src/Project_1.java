import java.util.*;
public class Project_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = s.nextInt();
        for(int i = 0; i <= 10; i++){
            System.out.println(n + "*" + i + "=" + n*i);
        }
    }
}
