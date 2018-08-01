import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;

    public Library (int capacity) {
    this.stock = new ArrayList<Book>();
    this.capacity = capacity;
    }
//close constructor

    /**
     *
     * @return
     */

    public int bookCount() {
        return this.stock.size();
    }
////
    public void addBook(Book book){
        this.stock.add(book);
    }

    public void removeBook(Book book) {
        this.stock.remove(0);
        capacity += 1;
// need to say what number of book u r removing
    }
////
    public boolean checkStock() {
        if (this.bookCount() < this.capacity) {
            return false;
        } else { return true;
        }
    }
    public void add(Book book){
        if (this.checkStock() == false) {
            this.stock.add(book);
            }
        }

//    public void removeBook(Book book) {
//        this.stock.remove(book);
//
//    }
}
