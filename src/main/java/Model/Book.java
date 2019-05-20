package Model;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Book {
    private final StringProperty bookTitle = new SimpleStringProperty(this, "title");
    public StringProperty bookTitleProperty() {
        return bookTitle ;
    }
    public final String getBookTitle() {
        return bookTitleProperty().get();
    }
    public final void setBookTitle(String bookTitle) {
        bookTitleProperty().set(bookTitle);
    }

    private final FloatProperty bookRate = new SimpleFloatProperty(this, "rate");
    public FloatProperty bookRateProperty() {
        return bookRate ;
    }
    public final Float getBookRate() {
        return bookRateProperty().get();
    }
    public final void setBookRate(Float bookRate) {
        bookRateProperty().set(bookRate);
    }

    public Book() {}

    public Book(String bookTitle, Float bookRate) {
        setBookTitle(bookTitle);
        setBookRate(bookRate);
    }

}

