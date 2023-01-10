package secondSetProblem3;

public class Triangle implements Shape {
	double base;
	double height;

	@Override
	public double calculateArea() {
		return 0.5 * base * height;
	}

	  public Triangle(double base, double height) {
	        this.base = base;
	        this.height = height;
	    }
	  
	@Override
	public void display() {
		System.out.println("Triangle with base " + base + " and height " + height);
	}

}
