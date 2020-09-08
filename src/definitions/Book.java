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

    //constructor for value initialisation
    public Book(String bookName, String authorName, String isbnNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.isbnNUMBER = isbnNumber;
    }

    public Book() {

    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    // get methods for fields.
    public String getBookName() {
        return bookName;
    }

    public void setIsbnNUMBER(String isbnNUMBER) {
        this.isbnNUMBER = isbnNUMBER;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getIsbnNUMBER() {
        return isbnNUMBER;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Book name: " + getBookName() + " Book price : " + getAuthorName() + " Book ISBN Number : " + getIsbnNUMBER();
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
