package Waggons;

/**
 * @author Eugene Matsumuar
 * @version 30.09.2021
 * 
 * Implementation Flachwagen
 */
public class Flachwagen extends Transportwagen {
    
    @Override
    public String gibAuskunft() {
        return "Flachwagen: " + leerGewicht + ", " + gesamtGewicht + ", " + zielGebiet;
    }
}
