public class Einkaufszettel {
    public BetterList<Artikel> artikelListe;

    public Einkaufszettel() {
        artikelListe = new BetterList<Artikel>();
    }

    public void einfuegen(Artikel artikel) {
        artikelListe.append(artikel);
    }

    public void entfernen(Artikel artikel) {
        artikelListe.remove(artikel);
    }

    public boolean istDrauf(Artikel artikel) {
        return artikelListe.find(artikel) != null;
    }

    public void listeAusgeben() {
        System.out.println(artikelListe);
    }
}