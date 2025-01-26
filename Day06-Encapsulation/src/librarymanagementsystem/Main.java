package librarymanagementsystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book = new Book(101,"To Kill a Mockingbird","Harper Lee");
        Magazine magazine = new Magazine(201, "The New Yorker", "R K Gupta");
        DVD dvd = new DVD(301, "Harry Potter and the Sorcerer’s Stone", "J.K. Rowling");

        ArrayList<LibraryItem> libraryItems = new ArrayList<>();
        libraryItems.add(book);
        libraryItems.add(magazine);
        libraryItems.add(dvd);

        System.out.println("******************************************************");

        for(LibraryItem l : libraryItems){
            l.getItemDetails();
            System.out.println("Loan Duration: " + l.getLoanDuration() + " days");

            if (l instanceof Reservable) {
                Reservable reservable = (Reservable) l;
                System.out.println("Availability: " + (reservable.checkAvailability() ? "Available " : "Not Available"));
                reservable.reserveItem("Aakrati BArsaiyan");
            }
            System.out.println("******************************************************");
        }
    }
}
