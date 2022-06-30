import java.util.Scanner;
public class Percentage {
    private int marks;
    private int percent;
    private int numSubjects;
    private int total;
    void Percentage() {
        total = 0;
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many subjects do you have? ");
        numSubjects = input.nextInt();
        for (int i = 0; i < numSubjects; i++) {
            System.out.println("Enter the marks: ");
            marks = input.nextInt();
            total += marks;
        }
    }

    public void calculate() {
        percent = (total*100)/(numSubjects*100);
    }

    public static void main(String[] args) {
        Percentage obj = new Percentage();
        obj.input();
        obj.calculate();
        System.out.println("Total percentage: " + obj.percent);
    }
}
