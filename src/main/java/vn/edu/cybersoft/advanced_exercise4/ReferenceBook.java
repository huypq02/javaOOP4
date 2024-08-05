package vn.edu.cybersoft.advanced_exercise4;

public class ReferenceBook extends Book{

    private String field;

    public ReferenceBook (String title, String author, String isbn, String field) {
        super(title, author, isbn);
        this.field = field;
    }

    @Override
    public void display_info() {
        super.display_info();
        System.out.println("Field: " + this.field);
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
