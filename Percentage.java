import java.util.Scanner;
public class Percentage {
    static int marks;
    static int percent_age;
    static int a;
    int total_score;
    public void input(){
        Scanner input = new Scanner (System.in);
        System.out.println("How many subjects do you have? ");
        int a = input.nextInt();
        for(int i = 0; i < a; i++){
            System.out.println("Enter the marks: ");
            marks = input.nextInt();
        }
    }
    public static int main(String[] args) {
        Percentage obj = new Percentage();
        obj.input();
        percent_age = (marks*100) / (a*100);
        System.out.println(obj.input(percent_age));
    }
}
