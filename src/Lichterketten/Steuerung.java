public class Steuerung {

    private BetterList<LED> leds;
    private int anzahlLEDs;

    public Steuerung() {
        leds = new BetterList<LED>();
        anzahlLEDs = 0;
    }

    public void leuchten1() {
        for (int i = 0; i < leds.size(); i++) {
            leds.get(i).lichtAn();
        }
    }

    public void leuchten2() {
        for (int i = 0; i < leds.size(); i++) {
            if (i % 2 == 0) {
                leds.get(i).lichtAn();
            } else {
                leds.get(i).lichtAus();
            }
        }
    }

    public void leuchten3() {
        for (int i = 0; i < leds.size(); i++) {
            if (i % 3 == 0) {
                leds.get(i).lichtAn();
            } else {
                leds.get(i).lichtAus();
            }
        }
    }

    private int getAnzahlLEDs() {
        return anzahlLEDs;
    }

    public void lichterketteAnhaengen(List<LED> leds) {
        this.leds.concat(leds);
        anzahlLEDs = this.leds.size();
    }
}