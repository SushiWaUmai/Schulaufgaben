public class Simulation {
    public static void main () {
        Artikel a = new Artikel("Test");
        Artikel a2 = new Artikel("Test1");
        Artikel a1 = new Artikel("Test2");
        
        Einkaufszettel zettel = new Einkaufszettel();
        zettel.einfuegen(a);
        zettel.einfuegen(a1);
        zettel.einfuegen(a2);
        zettel.listeAusgeben();

        System.out.println(zettel.istDrauf(a));

        zettel.entfernen(a);
        zettel.entfernen(a1);
        zettel.entfernen(a2);
        zettel.listeAusgeben();

        System.out.println(zettel.istDrauf(a));
    }
}