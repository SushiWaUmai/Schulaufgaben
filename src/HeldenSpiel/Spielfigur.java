// Spielfigur Implementaion
public class Spielfigur {
    private int staerke;
    private int lebenspunkte;
    private int angriffswert;

    public Spielfigur(int _staerke, int _lebenspunkte, int _angriffswert) {
        staerke = _staerke;
        lebenspunkte = _lebenspunkte;
        angriffswert = _angriffswert;
    }

    public int berechneSchaden() {
        return angriffswert + staerke;
    }

    public void AddiereLeben(int schaden) {
        lebenspunkte += Wuerfel.generiereZahl() * schaden;

        if(lebenspunkte <= 0){
            Sterbe();
        }
    }

    public void Sterbe() {
        System.out.println(this + " ist gestorben.");
    }

    public void greifeAn(Spielfigur figur) {
        figur.AddiereLeben(-berechneSchaden());
        AddiereLeben(-figur.berechneSchaden());
    }

    public String toString() {
        return this.getClass().getSimpleName();
    }
}