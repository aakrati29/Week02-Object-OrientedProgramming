class Circle{
	double radius;
	double circumferenceOfCircle;
	double areaOfCircle;
	
	// Initializing constructor
	Circle(double radius){
		this.radius = radius;
	}
	
	// Create a method to calculate circumference Of Circle and area of circle
	public void calculate(){
		this.circumferenceOfCircle = 2 * 3.14 * this.radius;
		this.areaOfCircle = 3.14 * this.radius * this.radius;
	}
	
	// Create a method to display details
	public void display(){
		System.out.println("----------Display result----------");
		System.out.println("Circumference Of Circle is : " + this.circumferenceOfCircle);
		System.out.println(" Area Of Circle is : " + this.areaOfCircle);
	}
}

public class CircleDemo{

	public static void main(String [] args){
		Circle cr = new Circle(25.0);
		cr.calculate();
		cr.display();
	}
}