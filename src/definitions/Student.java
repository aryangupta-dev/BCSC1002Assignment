/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    // fields necessary for student class.

    private String fullName;
    private long universityRollNo;
    private int numberOfBooksIssue;
    private Book[] issuedBooks;
    //getter  methods for the class fields.

    // constructor for the intilisation of values with four parameters in it.
    public Student(Book[] issuedBooks) {
        this.issuedBooks = issuedBooks;

    }

    public int getNumberOfBooksIssue() {
        return numberOfBooksIssue;
    }

    public long getUniversityRollNo() {
        return universityRollNo;
    }

    public String getFullName() {
        return fullName;
    }

    public Book[] getIssuedBooks() {
        return issuedBooks.clone();
    }

    // to string method for printing the method.
    @Override
    public String toString() {
        return " " + getFullName() + " " + getNumberOfBooksIssue() + " " + getUniversityRollNo();
    }

    //listIssue method to print the no of issued book with price.
    public void listIssue() {
        for (Book issue : this.issuedBooks) {
            System.out.println(issue);

        }
    }
}
