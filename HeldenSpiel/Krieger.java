public class Krieger extends Held {
    private int ausdauer;

    public Krieger(int _staerke, int _lebenspunkte, int _angriffswert, String _name, int _ausdauer){
        super(_staerke, _lebenspunkte, _angriffswert, _name);
        ausdauer = _ausdauer;
    }
}