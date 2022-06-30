public class Vehicle {
    protected String brand = "tata";
    public void horn(){
        System.out.println("hey!");
    }
}
class car extends Vehicle{
    String modelName = "Maruti Suzuki";

    public static void main(String[] args) {
        car myCar = new car();
        myCar.horn();
        System.out.println(myCar.brand);
    }
}