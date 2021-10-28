package Kreuzung;
/** 
 * Kreuzung
 * @author Eugene Matsumura
 * @version 1.0.0
 */
public class Kreuzung {

    // Attribute
    /** Erste Strasse*/
    private Strasse strasse1;

    /** Zweite Strasse*/
    private Strasse strasse2;

    /** Konstruktor 
     * @param _strasse1 Startwert von strasse1
     * @param _strasse2 Startwert von strasse2
    */
    public Kreuzung(Strasse _strasse1, Strasse _strasse2) {
        strasse1 = _strasse1;
        strasse2 = _strasse2;
    }

    /** Checkt ob die Kreuzung sicher ist 
     * @return Wahrheitswert fuer kreuzung sicher
    */
    public boolean istKreuzungSicher() {
        // Wenn beide Straßen gruen ist dann ist die kreuzung nicht sicher
        return !(strasse1.ampelSindGruen() && strasse2.ampelSindGruen());
    }
}
