class Circle{
	double radius;
	
	// Initializing parameterized constructor
	Circle(double radius){
		this.radius = radius;
	}
	
	// Call parameterized constructor in default constructor
	Circle(){
		this(12.5);		
	}
	
	// Create a method to find area of circle
	public void area(){
		double areaOfCircle = 3.14 * this.radius * this.radius;
		System.out.println("Area of circle is : " + areaOfCircle);
	}
}
		
public class CircleDemo{
	public static void main(String [] args){
	
	// Create a object of parameterized constructor
	Circle circle = new Circle(5.4);
	
	// Create a object of Default constructor
	Circle circleTwo = new Circle();
	
	circleTwo.area();
	}
}