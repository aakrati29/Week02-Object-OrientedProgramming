class Person{
	String name;
	int rollNumber;
	
	// Initializing parameterized constructor
	Person(String name, int rollNumber){
		this.name = name;
		this.rollNumber = rollNumber;
	}
	
	// Initializing copy constructor
	Person(Person anotherDetails){
		this.name = anotherDetails.name;
		this.rollNumber = anotherDetails.rollNumber;
	}
	
	// Create a method to display details
	public void display(){
		System.out.println("-----------Display Details-----------");
		System.out.println("Name : " + this.name);
		System.out.println("Roll number : " + this.rollNumber);
	}
}
	
	
public class PersonDetails{
	public static void main(String [] args){
	
	// Create a object of parameterized constructor
	Person person1 = new Person("Ram", 29);
	
	// Create a object of copy constructor
	Person person2 = new Person(person1);
	
	person2.display();
	}
}