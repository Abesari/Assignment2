package secondSetProblem3;

public class Main {

	public static void main(String[] args) {
		Shape circle = new Circle(4);
        circle.display();
        System.out.println("Area: " + circle.calculateArea());
		
		Shape rectangle = new Rectangle(1, 2);
	        rectangle.display();
	        System.out.println("Area: " + rectangle.calculateArea());
	        

	        Shape triangle = new Triangle(5, 7);
	        triangle.display();
	        System.out.println("Area: " + triangle.calculateArea());
	    }
	}