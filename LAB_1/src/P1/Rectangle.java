package P1;

public class Rectangle {
	private  double width;
	private  double height;
	static String color="white";
	
	public Rectangle() {
		
		height=1;
		width=1;
		
		// TODO Auto-generated constructor stub
	}
	
	public Rectangle(double width, double height) {
		//super();
		this.width = width;
		this.height = height;
	}
	public double getArea() {
		double area;
		area=width*height;
		return area;
		
	}
	public double getPerimeter() {
		double perimeter;
		perimeter=2*(width+height);
		return perimeter;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public static String getColor() {
		return color;
	}
	public static void setColor(String color) {
		Rectangle.color = color;
	}
	
}
