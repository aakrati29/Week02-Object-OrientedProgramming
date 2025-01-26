package librarymanagementsystem;

public interface Reservable {
    void reserveItem(String borrow);

    boolean checkAvailability();
}
