 /**
 * <h1 style="	margin: 1em 0 0.5em 0;
	color: #343434;
	font-weight: normal;
	font-family: 'Ultra', sans-serif;   
	font-size: 512px;
	line-height: 42px;
	text-transform: uppercase;
	text-shadow: 2px 2px white, 30px 30px #777;
    ">Strasse</h1>
 * @author Eugene Matsumura
 * @version 1.0.0
 */
class Strasse {

    // Attribute
    
    // Erste Ampel
    private Ampel ampel1;

    // Zweite Ampel
    private Ampel ampel2;

    // Auto auf der Strasse
    private Auto auto;

    // Konstruktor
    public Strasse(Ampel _ampel1, Ampel _ampel2, Auto _auto) {
        ampel1 = _ampel1;
        ampel2 = _ampel2;
        auto = _auto;
    }

    // Methoden

    // Schaltet Ampeln
    public void schalteAmpeln() {
        ampel1.schalteAmpel();
        ampel2.schalteAmpel();
    }

    // Helferfunktion
    // Checkt ob Ampeln Gruen sind
    public boolean ampelSindGruen() {
       return ampel1.istGruen() && ampel2.istGruen(); 
    }
    
    // Getter und Setter
    public Ampel getAmpel1() { return ampel1; }
    public Ampel getAmpel2() { return ampel2; }
    public Auto getAuto() { return auto; }
    public void setAmpel1(Ampel _ampel) { ampel1 = _ampel; }
    public void setAmpel2(Ampel _ampel) { ampel2 = _ampel; }
    public void setAuto(Auto _auto) { auto = _auto; }
}