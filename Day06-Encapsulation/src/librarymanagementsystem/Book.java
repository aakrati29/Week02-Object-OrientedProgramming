package librarymanagementsystem;

public class Book extends LibraryItem implements Reservable {
    private boolean checkReserve;
    private final int loanDuration = 20;
    private String borrow;

    Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return loanDuration;
    }

    @Override
    public void reserveItem(String borrow) {
        if (!checkReserve) {
            this.borrow = borrow;
            checkReserve = true;
            System.out.println("Book reserved by: " + borrow);
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    public boolean checkAvailability() {
        return !checkReserve;
    }
}
