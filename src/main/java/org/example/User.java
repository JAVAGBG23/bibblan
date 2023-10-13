package org.example;

public class User {
    String username;

    public User(String username) {
        this.username = username;
    }

    // vi behöver endast en getter för att komma åt username
    // vi vill inte ha någon setter, bara om vi vill ändra username...
    public String getUsername() {
        return username;
    }

    // overridar vanliga toString() metoder
    // högerklicka på klassen => välj generate => välj sen toString och markera de fält du vill ha med
    // så kommer den här metoden att skapas
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
}
