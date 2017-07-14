import java.io.FileNotFoundException;

/**
 * Created by Magda on 11.07.2017.
 */
public class Main {
    public static void main(String args[]) throws FileNotFoundException {
        Uzytkownik uzytkownik = new Uzytkownik("Ala", "Nowak", 12, 222);
        SkrzynkaPocztowa skrzynkaPocztowa = new SkrzynkaPocztowa(uzytkownik);
        skrzynkaPocztowa.wyslijEmail("wiadomossc", "Ala ma kota");
    }
}
