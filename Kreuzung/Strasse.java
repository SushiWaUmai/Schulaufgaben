class Strasse {

    // Attribute
    private Ampel ampel1;
    private Ampel ampel2;
    private Auto auto;

    // Konstruktor
    public Strasse(Ampel _ampel1, Ampel _ampel2, Auto _auto) {
        ampel1 = _ampel1;
        ampel2 = _ampel2;
        auto = _auto;
    }

    // Methoden
    public void schalteAmpeln() {
        ampel1.schalteAmpel();
        ampel2.schalteAmpel();
    }

    // Helferfunktion
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