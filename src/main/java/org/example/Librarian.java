package org.example;

import java.util.ArrayList;
import java.util.List;

public class Librarian {
    private List<Book> allBooks;
    private List<Book> borrowedBooks;
    private List<Book> availableBooks;
    private List<User> users;

    public Librarian() {
        allBooks = new ArrayList<>();
        borrowedBooks = new ArrayList<>();
        availableBooks = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBookToArray(Book book) {
        allBooks.add(book);
        availableBooks.add(book);
        System.out.println("Successfully added book: " + book.getTitle());
    }

    public void allBooks() {
        for (Book book : allBooks) {
            System.out.println("All books:\n" + book.toString());
        }
    }
}
