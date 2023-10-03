package org.example;

import java.util.Scanner;

/*Den här klassen är också lite speciell med några speciella fält
Vi har tex en privat scanner och vi skapar faktiskt en instans av Librarian klassen
Det här är pga det är endast en Librarian som kan lägga till en bok och lista alla
böcker. Den här klassen ska, precis som den heter, endast tillhanda hålla meny val för en user
samt ta emot user input för i den här klassen så skapar jag ett nytt sätt att lägga till en bok
genom just att ta emot user input.
*/

public class Menu {
    private Scanner input = new Scanner(System.in);
   // isRunning använder vi som villkor i vår while looå
    private boolean isRunning = true;
    // skapar en ny instans av klassen Librarian
    Librarian lib = new Librarian();

    // Konstruktorn ser ut så här för att vi ska kunna uppnåt att bara ha en
    // enda rad kod i vår Main klass :) Se klassen Main för förklaring
    public Menu() {
        mainMenu();
    }

    // När vi skapar en instans av Menu kommer mainMenu direkt att köras
    // för att vi kallar på mainMenu() i vår konstruktor
    public void mainMenu() {
        while(isRunning) {
            System.out.println("LIBRARY MAIN MENU:\n" +
                    "[1] Add new book");

            try {
                // vi tar emot vår input som en string, då behöver vi också säga att våra cases ska vara
                // strings som ni ser här nedan
                String choice = input.nextLine();

                switch (choice) {
                    case "1":
                        System.out.println("Adding new book");
                        // istället för att kladda med en massa kod här inne kallar vi istället
                        // på en separat metod. Vi hade såklart kunna skriva alla den koden rakt här inne också men
                        // det hade blivit lite rörigare...
                        addNewBook();
                        break;
                    default:
                        System.out.println("Default!");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Something went wrong!");
            }
        }
    }

    // metod för att låta en biblotikarie/administratör skriva i alla
    // fälten för en bok som ska läggas till
    // notera att vi byter variabel namn efter varje fråga i vår println
    // det behöver vi göra så vi inte kör över värdet någonstans
    // vi tar sedan alla input värden som vi sparat ner efter varje fråga till usern
    // och skapar en ny bok med dom fälten
    // efter att vi skapar boken ta vi vår Librarian och genom den kallar på
    // metoden addBookToArray() och boken läggs då till i våra arrayer:
    // allBooks availableBooks
    // till sist skriver vi ut alla böcker som finns i vår array med metoden
    // allBooks() som tillhör vår Librarian.
    // OBS! Notera att vi satte id till String på Book klassen
    // fundera lite på varför du tror att jag gjorde så? :)
    // vad händer om du ändrar till int för fältet id i Book här inne i den här metoden?
    public void addNewBook() {
        System.out.println("Please add book title: ");
        String title = input.nextLine();
        System.out.println("Please add book author: ");
        String author = input.nextLine();
        System.out.println("Please add book description: ");
        String description = input.nextLine();
        System.out.println("Please add book id: ");
        String id = input.nextLine();
        // skapar ny bok med vår input data
        Book newBook = new Book(title, author, description, id);

        // lägger till boken i bår allBooks array
        // det här kan vi endast göra genom en Librarian för det är den
        // klassen som äger addBookToArray metoden
        lib.addBookToArray(newBook);
        // vi listar sen alla böcker som finns i vår allBooks array
        // samma gäller här, endast vår Librarian kan göra detta
        // för allBooks metoden är definierad inne i Librarian klassen
        lib.allBooks();
    }








}
