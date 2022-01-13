/**
 * Beschreiben Sie hier die Klasse IntegerPP.
 *
 * @author GK Info
 * @version Dez 2019
 */
public class IntegerPP {
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int zahl;

    /**
     * Konstruktor für Objekte der Klasse Integer
     */
    public IntegerPP(int pZahl) {
        // Instanzvariable initialisieren
        zahl = pZahl;
    }

    public IntegerPP() {
        // Instanzvariable initialisieren
        zahl = (int) (Math.random() * 100);
    }

    /**
     * getMethode
     * 
     * @return zahlenwert
     */
    public int getZahl() {
        return zahl;
    }

    /**
     * setMethode
     * 
     * @param pZahl zahlenwert
     */
    public void setZahl(int pZahl) {
        zahl = pZahl;
    }
}