/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    private static final int ISSUE_A_BOOK_FOR_ME = 1;
    private static final int RETURN_A_PREVIOUSLY_ISSUES_BOOKS = 2;
    private static final int SHOW_ME_ALL_MY_ISSUES_BOOK = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library totalBooks = new Library();
        totalBooks.setLibraryBooks();
        totalBooks.listValue();
        System.out.println("Enter your name");
        String studentName = sc.nextLine();
        System.out.println("Enter your university roll no");
        long universityRollNO = sc.nextLong();
        Student myacc = new Student(studentName, universityRollNO);
        Student booksIssued = new Student();
        int choice;
        int noOfBooksWantToReturn = 0;
        do {
            System.out.println("1.Issue a book for me .");
            System.out.println("2.Return a book.");
            System.out.println("3.Show me total issue book");
            System.out.println("4.Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice) {
                case ISSUE_A_BOOK_FOR_ME:
                    System.out.println("Enter no of books you want to issue");
                    int noOfBooksissue = sc.nextInt();
                    Book[] studentIssue = new Book[noOfBooksissue];
                    booksIssued = new Student(studentIssue);
                    System.out.println("Enter the book name ,author name and Isbn no");
                    sc.nextLine();
                    for (int i = 0; i < studentIssue.length; i++) {
                        String bookName = sc.nextLine();
                        String authorName = sc.nextLine();
                        String isbnNumber = sc.nextLine();
                        int count = 0;
                        studentIssue[i] = new Book(bookName, authorName, isbnNumber);
                        for (Book librarybook : totalBooks.getTotalBooks()) {
                            if (studentIssue[i].equals(librarybook)) {
                                count++;
                            }
                        }
                        if (count > 0) {
                            System.out.println("Avaliable");
                        } else {
                            System.out.println("Not avaliable");
                            studentIssue[i] = new Book(null, null, null);
                        }
                    }
                    System.out.println(myacc);
                    booksIssued.listIssue();
                    break;
                case RETURN_A_PREVIOUSLY_ISSUES_BOOKS:
                    noOfBooksWantToReturn = sc.nextInt();
                    for (int i = 0; i < noOfBooksWantToReturn; i++) {
                        int indexofBookReturning = sc.nextInt();
                        if (indexofBookReturning > booksIssued.getIssuedBooks().length) {
                            System.out.println("wrong entry");
                        } else {
                            booksIssued.returnBook(indexofBookReturning);
                        }
                    }
                    break;
                case SHOW_ME_ALL_MY_ISSUES_BOOK:
                    if (noOfBooksWantToReturn > 0) {
                        booksIssued.remainingBook();
                    } else {
                        booksIssued.listIssue();
                    }

                    break;

            }
        } while (choice != EXIT);

    }
}