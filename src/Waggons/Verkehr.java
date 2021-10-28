 

/**
 * @author Eugene Matsumura
 * @version 30.09.2021
 * 
 * Implementation Verkehr
 */
public class Verkehr {

    public static void main(String[] args) {
        simuliere1();
        simuliere2();
    }

    // Simuliert Subtyping
    public static void simuliere1() {
        // Compiler Error
        // Transportwagen wagen1 = new Transportwagen();
       
        Transportwagen wagen2 = new Gueterwagen();
        Transportwagen wagen3 = new Flachwagen();

        // Compiler Error
        // Gueterwagen meinGW1 = new TransportWagen();

        // Compiler Error
        // Gueterwagen meinGW2 = new Flachwagen();
    }

    // Simuliert Typecast
    public static void simuliere2() {
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
    }
}
