public class Simulation {
    public static void main(String[] args) {
        Buero buero = new Buero();
        buero.hintenanstellen(new Person("Jens"));
        buero.hintenanstellen(new Person("Taifun"));
        buero.hintenanstellen(new Person("Robin"));

        System.out.println(buero);

        buero.sprechstundeBeenden();
        buero.sprechstundeBeenden();

        System.out.println(buero);
    }
}