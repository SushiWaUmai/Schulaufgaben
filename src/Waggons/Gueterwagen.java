// Brauchst du garnicht
 

/**
 * @author Eugene Matsumura
 * @version 30.09.2021
 * 
 * Implementation Gueterwagen 
 */
public class Gueterwagen extends Transportwagen {
    protected String dachMaterial;

    @Override
    public String gibAuskunft() {
        return "Gueterwagen: " + leerGewicht + ", " + gesamtGewicht + ", " + zielGebiet + ", " + dachMaterial;
    } 
}
