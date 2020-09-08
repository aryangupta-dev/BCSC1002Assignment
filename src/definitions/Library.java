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
    private static final int noOfBooks = 2;
    //getter method for the totalbooks.

    //constructor for the initialisation of Book array.
    public Library() {
        this.totalBooks = new Book[noOfBooks];
        for (int i = 0; i < noOfBooks; i++) {
            this.totalBooks[i] = new Book();
        }
    }

    public void setLibraryBooks() {
        totalBooks[0].setBookName("java");
        totalBooks[0].setAuthorName("kumar");
        totalBooks[0].setIsbnNUMBER("5481626124156");
        totalBooks[1].setBookName("c++");
        totalBooks[1].setAuthorName("munshi");
        totalBooks[1].setIsbnNUMBER("8519164457845");
    }

    public Book[] getTotalBooks() {
        return totalBooks.clone();
    }

    public void setTotalBooks(Book[] totalBooks) {
        this.totalBooks = totalBooks;
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

    public void listValue() {
        for (Book book : totalBooks) {
            System.out.println(book);
        }
    }
}
