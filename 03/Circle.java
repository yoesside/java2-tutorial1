//Putu Yoga Era Subakti
//E1700879

public class Circle {
	
	public double radius;
	public Point center = new Point();
	
	
	public Circle(double center, double point, double radius){
		
		this.radius=0;
	}
	
	public Circle() {
		this.center.setX(0);
		this.center.setY(0);
		this.radius = radius;
		
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
}
