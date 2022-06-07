public class Main {
    public static void main(String[] args) {
        Freundschaftsbeziehungen freundschaftsbeziehungen = new Freundschaftsbeziehungen();

        freundschaftsbeziehungen.freundschaftsGraphErzeugen();

        System.out.println(freundschaftsbeziehungen.sindBefreundet("Susi", "Karl"));

        System.out.println(freundschaftsbeziehungen.getGrad("Karl"));

        System.out.println(freundschaftsbeziehungen.getMinGrad());
    }
}
