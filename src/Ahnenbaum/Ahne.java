/**
 * @author Eugene Matsumura
 * @version 24.03.2022
 *          Klasse Ahne
 */
public class Ahne {
    char geschlecht;
    int geburtsjahr;

    /**
     * Konstruktor für Objekte der Klasse Ahne
     * @param geschlecht Geschlecht der Ahne
     * @param geburtsjahr Geburtsjahr der Ahne
     */
    public Ahne(char geschlecht, int geburtsjahr) {
        this.geschlecht = geschlecht;
        this.geburtsjahr = geburtsjahr;
    }

    public String toString() {
        return "Ahne: " + geschlecht + " " + geburtsjahr;
    }
}
