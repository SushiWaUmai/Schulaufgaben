// Waffe Implementation
public class Waffe {
    private int material;
    private int magie;

    public int berechneBonus() { return material + magie; }

    public Waffe(int _material, int _magie) {
        material = _material;
        magie = _magie;
    }
}