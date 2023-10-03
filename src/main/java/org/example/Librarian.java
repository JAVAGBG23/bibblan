package org.example;

import java.util.ArrayList;
import java.util.List;

/*
Den här klassen är lite speciell. Notera att jag INTE har autogenererat en konstruktor i den här klassen
utan jag har skapat den själv. Det är smidigt att autogenerera konstruktor men det är inte alltid vi
vill det, som i det här fallet.

Fälten för den här klassen är alla olika listor av vår egna klasser: Book och User. Men tänk på att:
private List<Book> allbooks;
inte ÄNNU är en arrayList, det blir den först när vi skapar en instans av klassen och det här beror på
att vi sagt det i konstruktorn på rad 25. När vi skapar en instans av den här klassen kommer alla våra List
fält blir nya ArrayLists
*/

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

    // metod för att lägga till en ny bok i BÅDE listan för alla böcker
    // och i listan för tillgängliga böcker.
    // innan vi avslutar metoden skriver vi ut ett meddelande med titeln
    // på boken som precis blev tillagd
    public void addBookToArray(Book book) {
        allBooks.add(book);
        availableBooks.add(book);
        System.out.println("Successfully added book: " + book.getTitle());
    }

    // metod för att lista alla böcker som finns.
    // när vi lägger till en ny bok så läggs dom i listan allBooks
    // så det är den vi behöver loopa igenom.
    // vi gör det med en foreach loop och för varje bok vi har i vår
    // lista allBooks skriver vi ut toString() metoden för Book.
    public void allBooks() {
        for (Book book : allBooks) {
            System.out.println("All books:\n" + book.toString());
        }
    }
}
