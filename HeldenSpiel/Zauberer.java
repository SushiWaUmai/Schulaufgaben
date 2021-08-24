public class Zauberer extends Held {
    private int heilStaerke;

    public Zauberer(int _staerke, int _lebenspunkte, int _angriffswert, String _name, Waffe _waffe, int _heilStaerke) {
        super(_staerke, _lebenspunkte, _angriffswert, _name, _waffe);
        heilStaerke = _heilStaerke;
    }

    // Der Zauberer kann sich selbst heilen
    public void heile() {
        AddiereLeben(heilStaerke);
    }
}