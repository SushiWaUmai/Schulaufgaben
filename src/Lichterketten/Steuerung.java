public class Steuerung {

    private BetterList<LED> leds;

    public Steuerung() {
        leds = new BetterList<LED>();
    }

    public void leuchten1() {
        for (int i = 0; i < leds.size(); i++) {
            leds.get(i).lichtAn();
        }
    }

    public void leuchten1NormalList() {
        while(leds.getContent() != null) {
            leds.getContent().lichtAn();
            leds.next();
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

    public void leuchten2NormalList() {
        int i = 0; 
        while(leds.getContent() != null) {
            if(i % 2 == 0) {
                leds.getContent().lichtAn();
            } else {
                leds.getContent().lichtAus();
            }
            i++;
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

    public void leuchten3NormalList() {
        int i = 0; 
        while(leds.getContent() != null) {
            if(i % 3 == 0) {
                leds.getContent().lichtAn();
            } else {
                leds.getContent().lichtAus();
            }
            i++;
        }
    }

    public void lichterketteAnhaengen(List<LED> leds) {
        this.leds.concat(leds);
    }
}