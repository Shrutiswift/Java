class test {
    int x;
    int y;
    test(int x, int y){
        this.x = x;
        this.y = y;
    }
    void display() {
        System.out.println("x= " + x + " y= " + y);
    }
    public static void main(String[] args) {
        test object = new test(1, 3);
        object.display();
    }
}