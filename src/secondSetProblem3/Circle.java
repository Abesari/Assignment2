package secondSetProblem3;

public class Circle implements Shape{

	double radius;
	
	 public Circle(double radius) {
		    this.radius = radius;
		  }

	@Override
	public double calculateArea() {
		 return Math.PI * radius * radius;
	}

	@Override
	public void display() {
		System.out.println("Circle with radius " + radius);
		
	}
	
}
