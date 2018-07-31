import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;

    public Library() {
    this.stock = new ArrayList<>();
    this.capacity = capacity;
    }


    public int bookCount() {
        return this.stock.size();
    }
////
    public void addBook(Book book){
        this.stock.add(book);
    }

    public void removeBook(Book book) {
        this.stock.remove(book);
    }
////
    public boolean checkStock() {
        if (this.bookCount() < this.capacity) {
            return false;
        } else { return true;
        }
    }
//
    public void add(Book book){
        if (this.checkStock() == false) {
            this.stock.add(book);
            }
        }
        
    public void removeBook(Book book) {
        this.stock.remove(book);
        capacity += 1;
    }
}
