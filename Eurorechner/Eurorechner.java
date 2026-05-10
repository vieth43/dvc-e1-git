import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ein einfacher Währungsrechner zur Umrechnung von Euro in US-Dollar und
 * umgekehrt. Der Wechselkurs wird über den Konstruktor übergeben.
 */
public class Eurorechner {

    private final double wechselkurs;

    /**
     * Konstruktor, der den Wechselkurs festlegt.
     * 
     * @param wechselkurs Der Umrechnungswert von Euro zu US-Dollar
     */
    public Eurorechner(double wechselkurs) {
        this.wechselkurs = wechselkurs;
    }

    /**
     * Führt den Währungsrechner aus. Fragt nach der Währung, dem Betrag und rechnet
     * um. Nachdem die Umrechnung durchgeführt wurde, fragt das Programm, ob der
     * Benutzer eine neue Berechnung durchführen möchte.
     * 
     * @throws IOException Wenn beim Einlesen der Benutzereingabe ein Fehler auftritt
     */
    public void start() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String weiter = "j";

        while (weiter.equals("j")) {

            System.out.print("Eingabe der Ausgangswaehrung (E)uro oder (U)S Dollar ? : ");
            String waehrung = reader.readLine().toLowerCase();

            if (waehrung.equals("e")) {
                berechneEuroZuDollar(reader);
            } else if (waehrung.equals("u")) {
                berechneDollarZuEuro(reader);
            } else {
                System.out.println("Falsche Eingabe bitte nochmal!");
                continue;
            }

            // Abfrage, ob der Benutzer eine neue Umrechnung starten möchte
            while (true) {
                System.out.print("Wollen Sie noch einmal j/n? : ");
                String antwort = reader.readLine().toLowerCase();

                if (antwort.equals("j")) {
                    break;
                } else if (antwort.equals("n")) {
                	System.out.println("Programm beendet.");
                	return; 
                } else {
                    System.out.println("Ungültige Eingabe. Bitte 'j' oder 'n' eingeben.");
                }
            }
        }
    }

    /**
     * Umrechnung von Euro zu US-Dollar.
     * 
     * @param reader Der BufferedReader, um die Benutzereingabe zu lesen
     * @throws IOException Wenn beim Einlesen der Benutzereingabe ein Fehler auftritt
     */
    private void berechneEuroZuDollar(BufferedReader reader) throws IOException {
        System.out.print("Bitte Euro-Betrag eingeben: ");
        try {
            String eingabe = reader.readLine().replace(",", ".");
            double euro = Double.parseDouble(eingabe);
            double dollar = euro * wechselkurs;
            System.out.printf("Das sind %.2f US-Dollar.%n", dollar);
        } catch (NumberFormatException e) {
            System.out.println("Falsche Eingabe bitte nochmal!");
        }
    }

    /**
     * Umrechnung von US-Dollar zu Euro.
     * 
     * @param reader Der BufferedReader, um die Benutzereingabe zu lesen
     * @throws IOException Wenn beim Einlesen der Benutzereingabe ein Fehler auftritt
     */
    private void berechneDollarZuEuro(BufferedReader reader) throws IOException {
        System.out.print("Bitte Dollar-Betrag eingeben: ");
        try {
            String eingabe = reader.readLine().replace(",", ".");
            double dollar = Double.parseDouble(eingabe);
            double euro = dollar / wechselkurs;
            System.out.printf("Das sind %.2f Euro.%n", euro);
        } catch (NumberFormatException e) {
            System.out.println("Falsche Eingabe bitte nochmal!");
        }
    }

    /**
     * Startpunkt des Programms.
     * 
     * @param args Wird nicht verwendet
     * @throws IOException Wenn beim Starten des Programms ein Fehler auftritt
     */
    public static void main(String[] args) throws IOException {
        Eurorechner rechner = new Eurorechner(1.1); // Beispielkurs: 1 Euro = 1.1 Dollar
        rechner.start();
    }
}