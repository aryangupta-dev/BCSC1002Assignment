/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    // fields used in the book class.

    private String bookName;
    private String authorName;
    private String isbnNUMBER;


    // get methods for fields.
    public String getBookName() {
        return bookName;
    }

    //constructor for value initialisation
    public Book(String bookName) {
        this.bookName = bookName;
        this.authorName = "kumar";
        this.isbnNUMBER = "6425612155";
    }

    public String getIsbnNUMBER() {
        return isbnNUMBER;
    }

    public String getBookPrice() {
        return authorName;
    }

    @Override
    public String toString() {
        return "Book name: " + getBookName() + " Book price : " + getBookPrice() + " Book ISBN Number : " + getIsbnNUMBER();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) &&
                Objects.equals(authorName, book.authorName) &&
                Objects.equals(isbnNUMBER, book.isbnNUMBER);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorName, isbnNUMBER);
    }
}
