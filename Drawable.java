
class Rectangle implements Drawable {
    public void draw(){
        System.out.println("hsavhs");
    }
}
class Default implements Drawable{
    public void draw(){
        System.out.println("Heyyy");
    }
}
class Me{
    public static void main(String[] args){
        Drawable b = new Default();
        b.draw();
    }
}
