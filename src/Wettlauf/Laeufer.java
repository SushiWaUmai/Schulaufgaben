/** Die Klasse Laeufer zur Simulation eines Wettlaufes
 * @author GK INfo Q1 2021/22
 * @version 10.11.21
 */

public class Laeufer
{
    private String name;
    private double zeit;
    private boolean quali;

    /**
     * Konstruktor für Objekte der Klasse Laeufer
     * @param String pName - Beim Erzeugen eines Läufers wird der Name als Parmeter übergeben.
     */
    public Laeufer(String pName)
    {
        name = pName;
        zeit = 0;
        quali = false;
    }

    // Getter und Setter
    public double getZeit() {
        return zeit;
    }

    public void setZeit(double pZeit) {
        zeit = pZeit;
    }

    public String getName() {
        return name;
    }

    public void setQuali(boolean pQuali) {
        quali = pQuali;
    }

    public boolean getQuali() {
        return quali;
    }
}