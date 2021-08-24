public class Held extends Spielfigur {
    private String name;

    public Held(int _staerke, int _lebenspunkte, int _angriffswert, String _name) {
        super(_staerke, _lebenspunkte, _angriffswert);
        name = _name;
    }
}