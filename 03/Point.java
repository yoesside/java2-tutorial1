//Putu Yoga Era Subakti
//E1700879

public class Point{
	private double x;
	private double y;
	
	public Point(double x, double y){
		this.x=x;
		this.y=y;
	}
	
	public Point() {
		this.x=0;
		this.y=0;
	}
	
	
	public double getX() {
		return this.x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	public String toString() {
		String all = "this x: " + x + " this y:" + y;
		return all;
	}
	
}
