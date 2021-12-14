public class Simulation {
    public static void main(String[] args) {
        Buero buero = new Buero();
        buero.hintenanstellen(new Person("Jens"));
        buero.hintenanstellen(new Person("Taifun"));
        buero.hintenanstellen(new Person("Robin"));

        buero.einlassen();
        System.out.println(buero);

        buero.einlassen();
        System.out.println(buero);

        buero.sprechstundeBeenden();

        System.out.println(buero);
    }
}