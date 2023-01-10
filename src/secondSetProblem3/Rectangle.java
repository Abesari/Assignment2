package secondSetProblem3;

public class Rectangle implements Shape {
	
	public double width;
	public double height;
	
	public Rectangle(double width, double height) {
	    this.width = width;
	    this.height = height;
	  }
	
	@Override
	public double calculateArea() {
		return width * height;
	}

	@Override
	public void display() {
		System.out.println("Rectangle with width " + width + " and height " + height);
	}

}
