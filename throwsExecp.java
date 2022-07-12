class ThrowsExecp {
    public static void main(String[] args) {
        try{
            int data;
        }
        catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("0");
        }
    }
}