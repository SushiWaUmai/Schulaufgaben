public class Test {
    public static void test() {
        Wettlauf test = new Wettlauf(8);

        System.out.println("Durchschnittszeit: " + test.getDurchschnittszeit());
        System.out.println();

        System.out.println("Langsamster Laeufer:\n" + test.getLangsamsterLaeufer());
        System.out.println();

        System.out.println("Schnellster Laeufer:\n" + test.getSchnellsterLaeufer());
        System.out.println();
    }
}
