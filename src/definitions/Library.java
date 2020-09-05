/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {
    // field to store total no of books avaliable in the library.
    private Book[] totalBooks;

    //getter method for the totalbooks.
    public Book[] getTotalBooks() {
        return totalBooks.clone();
    }

}
