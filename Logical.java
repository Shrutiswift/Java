public class Logical {
    public static void main(String[] args) {
        boolean hasGoodIncome = true;
        boolean hasGoodCredit = true;
        boolean isEligible = hasGoodCredit || hasGoodIncome;
        System.out.println(isEligible);
    }
}
