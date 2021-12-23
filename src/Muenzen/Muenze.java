import java.lang.Math;

public class Muenze {
    private int wert;

    public Muenze() {
        int[] werte = new int[] {10, 20, 50, 100, 200};
        wert = werte[(int)(Math.random() * werte.length)];
    }

    public int getWert() {
        return wert;
    }
}