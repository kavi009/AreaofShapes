package session6;

interface Shape {
	 
    //implicitly public, static and final
    public String LABLE="Shape";
     
    //interface methods are implicitly abstract and public
    void draw();
     
    double getArea();
}
class Circle implements Shape {
	 
    private double radius;
 
    public Circle(double r){
        this.radius = r;
    }
     
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
     
    @Override
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
 
    public double getRadius(){
        return this.radius;
    }
    
}
class Rectangle implements Shape {
	 
    private double width;
    private double height;
     
    public Rectangle(double w, double h){
        this.width=w;
        this.height=h;
    }
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
 
    @Override
    public double getArea() {
        return this.height*this.width;
    }
 
}
public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//programming for interfaces not implementation
        Shape shape = new Circle(10);
         
        shape.draw();
        System.out.println("Area="+shape.getArea());
         
        //switching from one implementation to another easily
        shape=new Rectangle(10,10);
        shape.draw();
        System.out.println("Area="+shape.getArea());
        }
	}


