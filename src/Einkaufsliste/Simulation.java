public class Simulation {
    public static void main () {
        Artikel a = new Artikel("Test");
        Einkaufszettel zettel = new Einkaufszettel();
        zettel.einfuegen(a);

        System.out.println(zettel.istDrauf(a));

        zettel.entfernen(a);

        System.out.println(zettel.istDrauf(a));
    }
}