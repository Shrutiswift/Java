class Rectangle implements Bicycle {
    public void applyspeed() {
        System.out.println("Increase the speed by 10%");
    }

    public void rest() {
        System.out.println("Take rest");
    }
}
class Drawable{
    public static void main(String[] args) {
        Rectangle obj = new Rectangle();
        obj.applyspeed();
        obj.rest();
    }
}



