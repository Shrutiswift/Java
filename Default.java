import java.util.Scanner;

public class Default {
    public static void main(String[] args) {
//        Default obj = new Default();
          Scanner input = new Scanner(System.in);
          System.out.println("How many times do you want to take input?");
          int a = input.nextInt();
          for(int i = 0; i < a; i++) {
              System.out.println("What is your name?");
              String name = input.next();
              System.out.println("Hello " + name + "!");
          }

      }

}

