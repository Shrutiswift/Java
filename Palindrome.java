import java.util.Scanner;

public class Palindrome {
    int sum;
    int remainder;
    Palindrome(){
        sum = 0;
    }
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        while(num >0) {
            remainder = num%10;
            sum = (sum*10) + remainder;
            num = num/10;
        }
        if

    }
    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        obj.input();
    }
}
