package librarymanagementsystem;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    LibraryItem(int itemId, String title, String author){
        this. itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public int getAccountNumber(){
        return itemId;
    }
    public void setAccountNumber(int itemId){
        this.itemId = itemId;
    }

    public String  getHolderName(){
        return title;
    }
    public void setHolderName(String title){
        this.title = title;
    }

    public String getBalance(){
        return author;
    }
    public void setBalance(String  author){
        this.author = author;
    }

    public abstract int getLoanDuration();

    public void getItemDetails(){
        System.out.println("Item id : " + itemId);
        System.out.println("Title is : " + title);
        System.out.println("Author is : " + author);
    }
}
