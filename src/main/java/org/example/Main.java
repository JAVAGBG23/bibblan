package org.example;

public class Main {
    public static void main(String[] args) {
       Menu menu = new Menu();

        //User user = new User("Helena");

        // kör vi toString utan att ha skapat en override metod i Use klassen ser det inte så kul ut... vi får hashkoden på vår user
        // men om vi går till User klassen och autogenererar toStrong() som i sin tur kommer overrida den vanliga toString() metoder
        // får vi en mycket mer vettig output om vår user. Se User klassen och toString() metoden.
        //System.out.println(user.toString());

        // skapar en ny bok enligt hur vår konstruktor ser ut => se Book klassen för förklaring
        //Book bookOne = new Book("JavaScript: The Good Parts", "Douglas Crockford", "Most programming languages contain good and bad parts, but JavaScript has more than its share of the bad..", "1");
        //System.out.println(bookOne.toString());
        // testar vår metod för att kolla om boken är tillgänglig eller inte
        //bookOne.available();

        // Librarian är i det här fallet den som ansvarar över alla böcker och i princip allt
        // man kan göra med en bok. Det tåls dock att fundera lite på vem som ska "äga" metoden att låna en bok...
        // det här kan vi diskutera lite vid nästa tillfälle
        // men vi skapar i alla fall en instans av en Librarian här
        /*Librarian lib = new Librarian();

        // vi lägger sedan till den skapade boken i våra arrays => se Librarian för förklaring om metoden
        // OBS! Endast en Librarian kan lägga till en bok, Librarian äger den metoden så utan en instans av en
        // Librarian kan vi inte lägga till en bok.
        lib.addBookToArray(bookOne);

        // vi testar också vår metod där vi listar alla böcker som finns i vår allBooks array
        // den här metoden ansvarar också librarian över.
        lib.allBooks();
*/







    }
}