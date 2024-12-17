// Program to implement a Book class that stores the details of a book such as its code, title
// and price (Use constructors to initialize the objects).

class Book {
    int code, price;
    String title;

    void init(String title_, int code_, int price_) {
        title = title_;
        code = code_;
        price = price_;
    }
}

public class BookExer {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.init("Atomic Habits", 10352, 850);
        System.out.println("Title: " + b1.title);
        System.out.println("Code: " + b1.code);
        System.out.println("Price: " + b1.price);
    }
}
