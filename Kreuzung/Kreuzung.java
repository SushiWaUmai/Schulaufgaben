class Kreuzung {

    // Attribute
    private Strasse strasse1;
    private Strasse strasse2;

    // Konstruktor
    public Kreuzung(Strasse _strasse1, Strasse _strasse2) {
        strasse1 = _strasse1;
        strasse2 = _strasse2;
    }

    // Wenn beide Straßen gruen ist dann ist die kreuzung nicht sicher
    public boolean kreuzungSicher() {
        return !(strasse1.ampelSindGruen() && strasse2.ampelSindGruen());
    }
}