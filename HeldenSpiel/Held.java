// Held Implementation
public class Held extends Spielfigur {
    private String name;
    private Waffe waffe;

    public Held(int _staerke, int _lebenspunkte, int _angriffswert, String _name, Waffe _waffe) {
        super(_staerke, _lebenspunkte, _angriffswert);
        name = _name;
        waffe = _waffe;
    }

    public String toString() {
        return super.toString() + ": " + name;
    }

    // Wenn der held eine Waffe besitzt sollte es einen Waffenbonus geben
    public int berechneSchaden() {
        // Addiere den Bonus
        return super.berechneSchaden() + (waffe != null ? waffe.berechneBonus() : 0);
    } 
}