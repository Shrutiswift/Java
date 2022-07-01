import java.util.Scanner;

public class Palindrome {
    int sum;
    int remainder;
    public Palindrome(){
        sum = 0;
        String reverse = " ";
    }
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a palindrome or not: ");
        String num = input.next();
        int length = num.length();
        for (int i = length - 1; i >= 0; i-- ){

            String reverse = "";
            if (num.equals(reverse))
            System.out.println("Entered string/number is a palindrome.");
        else
            System.out.println("Entered string/number isn't a palindrome.");
        }
    }
    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        obj.input();
    }
}
