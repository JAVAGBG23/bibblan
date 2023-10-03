package org.example;

import java.util.Scanner;

public class Menu {
    private Scanner input = new Scanner(System.in);
    private boolean isRunning = true;
    Librarian lib = new Librarian();

    public Menu() {
        mainMenu();
    }

    public void mainMenu() {
        while(isRunning) {
            System.out.println("LIBRARY MAIN MENU:\n" +
                    "[1] Add new book");

            try {
                String choice = input.nextLine();

                switch (choice) {
                    case "1":
                        System.out.println("Adding new book");
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

    public void addNewBook() {
        System.out.println("Please add book title: ");
        String title = input.nextLine();
        System.out.println("Please add book author: ");
        String author = input.nextLine();
        System.out.println("Please add book description: ");
        String description = input.nextLine();
        System.out.println("Please add book id: ");
        String id = input.nextLine();
        Book newBook = new Book(title, author, description, id);

        lib.addBookToArray(newBook);
        lib.allBooks();
    }








}
