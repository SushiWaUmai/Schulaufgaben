/** Klasse Ampel zur Darstellung einer Kreuzung mit zwei Autos
 * @author Eugene Matsumura
 * @version 1.0.0
 */
class Ampel {

    // Attribute
    private String farbe;
    
    // Konstruktor
    public Ampel(String _farbe) {
        farbe = _farbe;
    }

    // Methoden
    public void schalteAmpel() {
        farbe = (farbe == "rot" ? "grün" : "rot");

        System.out.println("Schalte Ampel Farbe zu " + farbe);
    }

    // Getter und Setter
    public String getFarbe() { return farbe; }
    public void setFarbe(String _farbe) { farbe = _farbe; }

    // Helferfunktion
    public boolean istGruen() { return farbe == "rot"; }
}