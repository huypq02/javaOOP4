package vn.edu.cybersoft.exercise2;

public class ReferenceBook extends Book {
    private String subject;

    public ReferenceBook(String title, String author, String isbn, String subject) {
        super(title, author, isbn);
        this.subject = subject;
    }

    @Override
    public void display_info() {
        super.display_info();
        System.out.println("Subject: " + this.subject);
    }
}
