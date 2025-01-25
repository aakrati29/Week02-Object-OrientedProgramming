package hybridinheritance;

class Person{
    String name;
    int id;

    Person(String name, int id){
        this.name = name;
        this.id = id;
    }

    public void displayDetails(){
        System.out.println("Name : " + name + ", ID : " + id);
    }
}

// Interface Worker
interface Worker{
    public void performDuties();
}

class Chef extends Person implements Worker{
    Chef(String name, int id){
        super(name, id);
    }

    @Override
    public void performDuties(){
        System.out.println("Chef performance is to making food");
    }
}

class Waiter extends Person implements Worker{
    Waiter(String name, int id){
        super(name, id);

    }

    @Override
    public void performDuties(){
        System.out.println("Waiter performance is to serve food");
    }
}

public class RestaurantManagementSystem{
    public static void main(String[] args) {
        Chef chef = new Chef("Aakrati", 201);
        chef.displayDetails();
        chef.performDuties();

        Waiter waiter = new Waiter("Ankit", 204);
        waiter.displayDetails();
        waiter.performDuties();
    }
}
