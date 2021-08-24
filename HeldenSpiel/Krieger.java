public class Krieger extends Held {
    private int ausdauer;

    public Krieger(int _staerke, int _lebenspunkte, int _angriffswert, String _name, Waffe _waffe, int _ausdauer){
        super(_staerke, _lebenspunkte, _angriffswert, _name, _waffe);
        ausdauer = _ausdauer;
    }

    // Krieger haben mehr schaden durch Ausdauer
    public int berechneSchaden() {
        return super.berechneSchaden() + ausdauer;
    }
}