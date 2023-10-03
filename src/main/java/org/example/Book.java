package org.example;

public class Book {
    private String title;
    private String author;
    private String description;
    private String id;
    private boolean isAvailable;

    // i konstruktorn skickar vi med alla fält förutom isAvailable
    // isAvailable sätter vi by default till true eftersom det är mest naturligt
    // att boken är tillgänglig direkt när den läggs in i boklistan
    // alla andra fält förväntar vi oss ange värden för när vi skapar en instans av klassen Book,
    // precis som vi gjort i Main klassen på rad 15
    public Book(String title, String author, String description, String id) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.id = id;
        isAvailable = true;
    }

    // metod för att returnera olika meddelande beroende på om boken är
    // tillgänglig eller inte
    public String available() {
        return isAvailable ? "Available" : "Not available";
    }

    // notera att vi bara har getter för våra fält. Vi vill inte
    // kunna ändra bokens fält efter att vi skapat den.
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // overridar toString() även här.
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", id='" + id + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
