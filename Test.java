class Test {
    int x;
    int y;
    Test(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {

        System.out.println("x = " + x +" y = "+ y);
    }

    void display(Test customObj) {

        System.out.println("x = " + customObj.x +" y = "+ customObj.y);
    }

    public static void main(String[] args) {
        Test obj1 = new Test(1, 2);
        obj1.display();
        Test obj2 = new Test(10, 20);
        obj1.display(obj2);
    }
}




