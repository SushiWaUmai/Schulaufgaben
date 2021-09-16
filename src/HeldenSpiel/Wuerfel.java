import java.lang.Math;

// Wuerfel Implemetation
public class Wuerfel {

    // Generiert eine zahl zwischen 1 und sechs
    public static int generiereZahl() {
        return (int)Math.random() * 7 + 1;
    }
}
