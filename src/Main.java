import java.util.ArrayList;
import java.util.Collections;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        KomputerWindows komputerW1 = new KomputerWindows("Asus", "Widnows 11");
        KomputerWindows komputerW2 = new KomputerWindows("Dell", "Widnows 11");

        KomputerMac komputerM1 = new KomputerMac("Mac","OS 17");
        KomputerMac komputerM2 = new KomputerMac("Macbook","OS 17");

        ArrayList<Komputer> komputery = new ArrayList<>();
        komputery.add(komputerW1);
        komputery.add(komputerW2);

        komputery.add(komputerM1);
        komputery.add(komputerM2);

        komputerM1.uruchom();
        komputerW1.uruchom();
        Collections.sort(komputery);
        System.out.println(komputery);
    }
}