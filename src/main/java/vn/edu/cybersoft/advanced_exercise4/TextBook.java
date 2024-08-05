package vn.edu.cybersoft.advanced_exercise4;

public class TextBook extends Book {
    private String subject;

    public TextBook(String title, String author, String isbn, String subject) {
        super(title, author, isbn);
        this.subject = subject;
    }

    @Override
    public void display_info() {
        super.display_info();
        System.out.println("Subject: " + this.subject);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
