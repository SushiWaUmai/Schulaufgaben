public class Lichterkette {
    private BetterList<LED> leds;

    public Lichterkette() {
        leds = new BetterList<LED>();
    }

    public void leuchten1() {
        for (int i = 0; i < leds.size(); i++) {
            leds.get(i).lichtAn();
        }
    }

    public void leuchten2() {
        leds.toFirst();
        for (int i = 0; i < leds.size(); i++) {
            if (i % 2 == 0) {
                leds.get(i).lichtAn();
            } else {
                leds.get(i).lichtAus();
            }
        }
    }

    public void leuchten3() {
        leds.toFirst();
        for (int i = 0; i < leds.size(); i++) {
            if (i % 3 == 0) {
                leds.get(i).lichtAn();
            } else {
                leds.get(i).lichtAus();
            }
        }
    }

    public void addLED(LED l) {
        leds.append(l);
    }

    public void lichterketteAnhaengen(BetterList<LED> leds) {
        this.leds.concat(leds);
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < leds.size(); i++) {
            s += leds.get(i).toString();
        }
        return s;
    }
}