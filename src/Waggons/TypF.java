package Waggons;

/**
 * @author Eugene Matsumura
 * @version 30.09.2021
 * 
 * TypF ein Gueterwagen
 */
public class TypF extends Gueterwagen {
    
    @Override
    public String gibAuskunft() {
        return "TypF: " + leerGewicht + ", " + gesamtGewicht + ", " + zielGebiet + ", " + dachMaterial;
    }
}
