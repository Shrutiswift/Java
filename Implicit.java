import java.text.DecimalFormat;

// byte > short > int > long > float > double
public class Implicit {
    public static void main(String[] args) {
        String x = "1.123121";
        double y = Double.parseDouble(x) + 2;
        System.out.println(y);
        DecimalFormat df = new DecimalFormat("#.####");
        System.out.println(Double.MAX_VALUE); 
        System.out.println(df.format(y));
    }
}



