package Waggons;

public abstract class Transportwagen {
    private int leerGewicht;
    private int gesamtGewicht;
    private String zielGebiet;

    public abstract String gibAuskunft();

    public String getZielgebiet() {return zielGebiet; }
    public void setZielgebiet(String _zielGebiet) { zielGebiet = _zielGebiet;}
}