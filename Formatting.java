import java.text.NumberFormat;

public class Formatting {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getPercentInstance();
        String result = currency.format(0.1);
        System.out.println(result);
    }
}



