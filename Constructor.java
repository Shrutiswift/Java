class Const{
    Construct obj;
    Const(Construct obj){
        this.obj = obj;
        obj.display();
    }
}
class Construct {
    int x = 10;
    Construct(){
        Const obj = new Const(this);

    }
    void display(){
        System.out.println("Value of x in class Construct: "+ x);
    }
    public static void main(String[] args){
        Construct obj = new Construct();
    }
}
