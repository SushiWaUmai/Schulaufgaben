public class Einkaufszettel {
    public List<Artikel> artikelListe;

    public Einkaufszettel() {
        artikelListe = new List<Artikel>();
    }

    public void einfuegen(Artikel artikel) {
        artikelListe.append(artikel);
    }

    public void entfernen(Artikel artikel) {
        bewegeDichZu(artikel);
        artikelListe.remove();
    }

    public boolean istDrauf(Artikel artikel) {
        return finde(artikel) != null;
    }

    public Artikel finde(Artikel a) {
        artikelListe.toFirst();

        while (artikelListe.getContent() != null) {
            Artikel artikel = artikelListe.getContent();
            if (artikel.equals(a)) {
                return artikel;
            }
            artikelListe.next();
        }
        return null;
    }

    private void bewegeDichZu(Artikel a) {
        artikelListe.toFirst();
        while (artikelListe.getContent() != a) {
            artikelListe.next();
        }
    }
}