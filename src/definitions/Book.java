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
    private String bookPrice;
    private String isbnNUMBER;


    // get methods for fields.
    public String getBookName() {
        return bookName;
    }
    public String getBookPrice() {
        return bookPrice;
    }

    public String getIsbnNUMBER() {
        return isbnNUMBER;
    }
    //constructor for value initialisation
    public Book(String bookName){
        this.bookName=bookName;
        this.bookPrice="150";
        this.isbnNUMBER="6425612155";
    }

    @Override
    public String toString() {
        return "Book name: "+getBookName()+" Book price : "+getBookPrice()+" Book ISBN Number : "+getIsbnNUMBER();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) &&
                Objects.equals(bookPrice, book.bookPrice) &&
                Objects.equals(isbnNUMBER, book.isbnNUMBER);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, bookPrice, isbnNUMBER);
    }
}
