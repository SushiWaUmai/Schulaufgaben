package Waggons;

/**
 * @author Eugene Matsumura
 * @version 30.09.2021 
 * 
 * Implementation Transportwagen
 */
public abstract class Transportwagen {

    // Attribute
    private int leerGewicht;
    private int gesamtGewicht;
    private String zielGebiet;

    // Gibt Auskunft
    public abstract String gibAuskunft();

    // 
    public String getZielgebiet() { return zielGebiet; }
    public void setZielgebiet(String _zielGebiet) { zielGebiet = _zielGebiet;}
}