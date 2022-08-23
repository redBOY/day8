package main.Program;

interface Drawable {
    void draw();
}
//Implementation: by second user
class rectangle implements Drawable{


    public void draw(){System.out.println("drawing rectangle");}
}
class circle implements Drawable{
    public void draw(){System.out.println("drawing circle");}
}
//Using interface: by third user
class TestInterface1 {
    public static void main(String args[]) {
        Drawable obj = new circle();//In real scenario, object is provided by method e.g. getDrawable()
        obj.draw();
    }
}


