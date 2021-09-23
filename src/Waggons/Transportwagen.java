package Waggons;

public abstract class Transportwagen {
    private int leerGewicht;
    private int gesamtGewicht;
    private String zielGebiet;

    public abstract String auskunft();

    private String getZielgebiet() {return zielGebiet; }
    private void setZielgebiet(String _zielGebiet) { zielGebiet = _zielGebiet;}
}