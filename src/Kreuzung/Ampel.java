/** Klasse Ampel zur Darstellung einer Kreuzung mit zwei Autos
 * @author Eugene Matsumura
 * @version 1.0.0
 */
public class Ampel {

    // Attribute
    /** Farbe des Ampels */
    private String farbe;
    
    // Konstruktor
    /** Erstellt eine Ampel
     * @param _farbe Die Anfangsfarbe
     */
    public Ampel(String _farbe) {
        farbe = _farbe;
    }

    /** Schaltet die Ampel von gruen zu rot und rot zu gruen */
    public void schalteAmpel() {
        farbe = (farbe == "rot" ? "grün" : "rot");

        System.out.println("Schalte Ampel Farbe zu " + farbe);
    }

    /** Liest den Wert farbe
     * @return Wert von farbe
     */
    public String getFarbe() { return farbe; }

    /** Setzt den Wert Farbe
     * @param _farbe die Farbe die gesetzt wird
     */
    public void setFarbe(String _farbe) { farbe = _farbe; }

    /** Schaut ob  die Ampel nicht rot ist
     * @return Wahrheitswert fuer Ampel ist gruen
    */
    public boolean istGruen() { return farbe != "rot"; }
}