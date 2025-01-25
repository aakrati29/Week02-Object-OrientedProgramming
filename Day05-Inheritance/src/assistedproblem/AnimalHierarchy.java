package assistedproblem;

class Animal{
    String name;
    int age;
    Animal(){}

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    void makeSound(){
        System.out.println("Nothing to print");

    }
}

class Dog extends Animal{

    Dog(String name, int age){
        super(name, age);
    }

    @Override
    void makeSound(){
        System.out.println("Dog name is : " + name);
        System.out.println("Age is : " + age);
        System.out.println(name + " makes sound");
    }
}

class Cat extends Animal{

    Cat(String name, int age){
        super(name,age);
    }

    @Override
    void makeSound(){
        System.out.println("Cat name is : " + name);
        System.out.println("Age is : " + age);
        System.out.println(name + " makes sound meoww");
    }
}

class Bird extends Animal{

    Bird(String name, int age){
        super(name, age);
    }

    @Override
    void makeSound(){
        System.out.println("Bird name is : " + name);
        System.out.println("Age is : " + age);
        System.out.println(name + " makes sound");
    }
}

public class AnimalHierarchy{

    public static void main(String [] args){

        Animal animal = new Animal();
        animal.makeSound();

        Dog dog = new Dog("Ankit",2);
        dog.makeSound();

        Cat cat = new Cat("Tommy", 5);
        cat.makeSound();

        Bird bird = new Bird("Peacock", 8);
        bird.makeSound();
    }
}
