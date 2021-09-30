package Waggons;

public class Verkehr {

    public static void main(String[] args) {
        simuliere1();
        simuliere2();
    }

    public static void simuliere1() {
        // Braucht man nicht
        System.out.println("Simuliere 1...");

        // Compiler Error
        // Transportwagen wagen1 = new Transportwagen();
       
        Transportwagen wagen2 = new Gueterwagen();
        Transportwagen wagen3 = new Flachwagen();

        // Compiler Error
        // Gueterwagen meinGW1 = new TransportWagen();

        // Compiler Error
        // Gueterwagen meinGW2 = new Flachwagen();

        // Braucht man nicht
        System.out.println("1 Simliert");
    }

    public static void simuliere2() {
        // Braucht man nicht
        System.out.println("Simuliere 2...");

        Transportwagen tw; Gueterwagen gw1, gw2; Flachwagen fw;
        gw1 = new Gueterwagen();
        tw = gw1;

        // Compiler Error
        // gw2 = tw;

        gw2 = (Gueterwagen)tw;

        // Compiler Error
        // fw = (Flachwagen)gw1;

        // Runtime Error
        // fw = (Flachwagen)tw;

        // Braucht man nicht
        System.out.println("1 Simliert");
    }
}
