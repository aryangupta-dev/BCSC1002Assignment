/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    // field to store total no of books avaliable in the library.
    private Book[] totalBooks;

    //getter method for the totalbooks.

    //constructor for the initialisation of Book array.
    public Library(Book[] totalBooks) {
        this.totalBooks = totalBooks;
    }

    public Book[] getTotalBooks() {
        return totalBooks.clone();
    }

    @Override
    public String toString() {
        return "Library{" +
                "totalBooks=" + Arrays.toString(totalBooks) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(totalBooks, library.totalBooks);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(totalBooks);
    }
}
