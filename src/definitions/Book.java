/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

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
}
