import java.text.NumberFormat;

public class Formatting {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(12345677.98765);
        System.out.println(result);
    }
}
