package Waggons;

/**
 * @author Eugene Matsumura
 * @version 30.09.2021 
 * 
 * Implementation Transportwagen
 */
public abstract class Transportwagen {

    // Attribute
    protected int leerGewicht;
    protected int gesamtGewicht;
    protected String zielGebiet;

    /**
     * Gibt Auskunft 
     * @return auskunft
     */
    public abstract String gibAuskunft();

    /**
     * Gibt Zielgebiet
     * @return Zielgebiet
     */
    public String getZielgebiet() { return zielGebiet; }

    /**
     * Setzt Zielgebiet
     * @param _zielGebiet wert
     */
    public void setZielgebiet(String _zielGebiet) { zielGebiet = _zielGebiet;}
}