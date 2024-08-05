package vn.edu.cybersoft.exercise2;

public class TextBook extends Book {
    private String fields;

    public TextBook(String title, String author, String isbn, String fields) {
        super(title, author, isbn);
        this.fields = fields;
    }

    @Override
    public void display_info() {
        super.display_info();
        System.out.println("Fields: " + this.fields);
    }

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }
}
