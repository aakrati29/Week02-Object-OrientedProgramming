package singleinheritance;

class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
    }
}

class Author extends Book{
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio){
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    public void displayInfo(){
        System.out.println("---------Author details----------");
        System.out.println("Title : " + title);
        System.out.println("Publication year : " + publicationYear);
        System.out.println("Author name " + name);
        System.out.println("Bio : " + bio);
    }
}

public class LibraryManagement{

    public static void main(String [] args){

        Author author = new Author("Dance", 2028, "Aakrati", "Dancer");
        author.displayInfo();
    }
}
