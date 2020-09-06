/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    // fields necessary for student class.

    private String fullName;
    private long universityRollNo;
    private int numberOfBooksIssue;
    private Book[] issuedBooks;
    //getter  methods for the class fields.

    // constructor for the intilisation of values with one parameters in it.
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

    public Student(String fullName, long universityRollNo) {
        this.fullName = fullName;
        this.universityRollNo = universityRollNo;
    }

    //listIssue method to print the no of issued book with price.
    public void listIssue() {
        for (Book issue : this.issuedBooks) {
            System.out.println(issue);

        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return universityRollNo == student.universityRollNo &&
                numberOfBooksIssue == student.numberOfBooksIssue &&
                Objects.equals(fullName, student.fullName) &&
                Arrays.equals(issuedBooks, student.issuedBooks);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(fullName, universityRollNo, numberOfBooksIssue);
        result = 31 * result + Arrays.hashCode(issuedBooks);
        return result;
    }

    public Student(int numberOfBooksIssue) {
        this.numberOfBooksIssue = numberOfBooksIssue;
    }

    // to string method for printing the method.
    @Override
    public String toString() {
        return " " + getFullName() + " " + getUniversityRollNo();
    }
}
