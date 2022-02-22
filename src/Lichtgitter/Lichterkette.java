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

    public void leuchten1NormalList() {
        leds.toFirst();
        while(leds.getContent() != null) {
            leds.getContent().lichtAn();
            leds.next();
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
        leds.toFirst();
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

    public void addLED(LED l) {
        leds.append(l);
    }

    public void lichterketteAnhaengen(BetterList<LED> leds) {
        this.leds.concat(leds);
    }

    public void lichterketteAnhaengenNormalList(List<LED> leds) {
        this.leds.concat(leds);
        int i = 0; 
        while (leds.getContent() != null) {
            leds.next();
            i++;
        }
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < leds.size(); i++) {
            s += leds.get(i).toString();
        }
        return s;
    }
    
    public String toStringNormalList() {
        String s = "";
        leds.toFirst();
        while(leds.getContent() != null) {
            s += leds.getContent().toString();
            leds.next();
        }
        return s;
    }
}