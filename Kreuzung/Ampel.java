/** Klasse Ampel zur Darstellung einer Kreuzung mit zwei Autos
 * <h1 style="	margin: 1em 0 0.5em 0;
	color: #343434;
	font-weight: normal;
	font-family: 'Ultra', sans-serif;   
	font-size: 512px;
	line-height: 42px;
	text-transform: uppercase;
    text-shadow: 2px 2px white, 30px 30px #777;
    ">Ampel</h1>
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