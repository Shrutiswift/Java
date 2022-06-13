public class Single {
    double l;
    double h;
    double w;
    Single() {
        this.h = 0;
        this.l = 1;
        this.w = 2;
    }
    Single(double a){
        this.w = a;
        this.l = a;
        this.h = a;
    }
    public Single(double l, double h, double w){
        this.l = w;
        this.h = l;
        this.w = h;
    }
    Single(Single old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void information() {
        System.out.println("Box");
    }
    public static void main(String[] args) {
        Single single = new Single(4.7, 3, 8);
        System.out.println(single.l + " "+ single.w + " " + single.h);
    }
}











