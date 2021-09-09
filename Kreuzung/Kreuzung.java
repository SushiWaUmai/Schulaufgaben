/** 
 * <h1 style="	margin: 1em 0 0.5em 0;
	color: #DC143C;
	font-weight: normal;
	font-family: 'Ultra', sans-serif;   
	font-size: 512px;
	line-height: 42px;
	text-transform: uppercase;
    text-shadow: 2px 2px white, 30px 30px #702963;  
    ">Kreuzung</h1>
 * @author Eugene Matsumura
 * @version 1.0.0
 */
class Kreuzung {

    // Attribute

    // Erste Strasse
    private Strasse strasse1;

    // Zweite Strasse
    private Strasse strasse2;

    // Konstruktor
    public Kreuzung(Strasse _strasse1, Strasse _strasse2) {
        strasse1 = _strasse1;
        strasse2 = _strasse2;
    }

    // Checkt ob die Kreuzung sicher ist 
    public boolean istKreuzungSicher() {
        // Wenn beide Straßen gruen ist dann ist die kreuzung nicht sicher
        return !(strasse1.ampelSindGruen() && strasse2.ampelSindGruen());
    }
}