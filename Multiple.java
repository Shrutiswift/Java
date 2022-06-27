import java.util.Scanner;
public class Multiple{
    int age;
    String name;
    public Multiple(String name, int age){
        this.age = age;
        this.name = name;
    }
    public Multiple() {

    }
    public void display() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.next();
        System.out.println("Enter your age: ");
        int age = input.nextInt();
    }
    public static void main(String[] args) {
        String name = null;
        int age = 0;
        Multiple object = new Multiple(null, age);
        object.display();
    }
}




