package Kreuzung;
 /**
 * Strasse
 * @author Eugene Matsumura
 * @version 1.0.0
 */
public class Strasse {

    // Attribute
   
    /** Erste Ampel*/
    private Ampel ampel1;

    /** Zweite Ampel*/
    private Ampel ampel2;

    /** Auto auf der Strasse*/
    private Auto auto;

    /** Konstruktor
     * @param _ampel1 Startwert von ampel1
     * @param _ampel2 Startwert von ampel2
     * @param _auto Startwert von auto
    */
    public Strasse(Ampel _ampel1, Ampel _ampel2, Auto _auto) {
        ampel1 = _ampel1;
        ampel2 = _ampel2;
        auto = _auto;
    }


    /** Schaltet Ampeln*/
    public void schalteAmpeln() {
        ampel1.schalteAmpel();
        ampel2.schalteAmpel();
    }

    // Helferfunktion
    /** Checkt ob Ampeln Gruen sind
     * @return Wahrheitswert fuer gruene Ampeln
    */
    public boolean ampelSindGruen() {
       return ampel1.istGruen() && ampel2.istGruen(); 
    }
    
    // Getter und Setter
    /** Liest den Wert ampel1
     * @return Wert von ampel1
     */
    public Ampel getAmpel1() { return ampel1; }

    /** Liest den Wert ampel2
     * @return Wert von ampel2
     */
    public Ampel getAmpel2() { return ampel2; }

    /** Liest den Wert auto
     * @return Wert von auto
     */
    public Auto getAuto() { return auto; }

    /** Setzt den Wert ampel1
     * @param _ampel Wert das gesetzt wird
    */
    public void setAmpel1(Ampel _ampel) { ampel1 = _ampel; }

    /** Setzt den Wert ampel2
     * @param _ampel Wert das gesetzt wird
     */
    public void setAmpel2(Ampel _ampel) { ampel2 = _ampel; }

    /** Setzt den Wert auto
     * @param _auto Wert das gesetzt wird
     */
    public void setAuto(Auto _auto) { auto = _auto; }
}