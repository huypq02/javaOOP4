package vn.edu.cybersoft.advanced_exercise4;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String user_id;
    private String name;
    private List<vn.edu.cybersoft.advanced_exercise4.Book> borrowed_books;

    public User(String user_id, String name) {
        this.user_id = user_id;
        this.name = name;
        this.borrowed_books = new ArrayList<>();
    }

    public void borrow(Book book) {
        this.borrowed_books.add(book);
    }


    public void return_book(Book book) {
        this.borrowed_books.remove(book);
    }

    public void display_info(){
        System.out.println("User ID: " + this.user_id);
        System.out.println("Name: " + this.name);
        System.out.println("Borrowed books: ");
        for (Book book : this.borrowed_books) {
            book.display_info();
        }
    }
}
