public class Vehicle {
    public int speed;
    protected String brand = "tata";
    public void slowdown(int decrement){
        speed -= decrement;
    }
    public Vehicle(){

    }
    public void horn(){
        System.out.println("hey!");
    }
}
class car extends Vehicle{
    String modelName = "Maruti Suzuki";

    public car(){

    }

    public static void main(String[] args) {
        car myCar = new car();
        myCar.horn();
        System.out.println(myCar.brand + ""+ myCar.modelName);
    }
}