public class Logical {
    public static void main(String[] args) {
        boolean hasGoodIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasGoodCredit || hasGoodIncome) && hasCriminalRecord;
        System.out.println(isEligible);
    }
}
