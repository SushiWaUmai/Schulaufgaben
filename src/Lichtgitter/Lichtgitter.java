public class Lichtgitter {
    private BetterList<Lichterkette> kette;

    public Lichtgitter() {
        kette = new BetterList<Lichterkette>();
    }

    public void addLichterkette(Lichterkette lk) {
        kette.append(lk);
    }

    public void leuchten1() {
        for (int i = 0; i < kette.size(); i++) {
            kette.get(i).leuchten1();
        }
    }


    public void leuchten2() {
        for (int i = 0; i < kette.size(); i++) {
            kette.get(i).leuchten2();
        }
    }

    public void leuchten3() {
        for (int i = 0; i < kette.size(); i++) {
            kette.get(i).leuchten3();
        }
    }

    public String toString() {
        String s = "";
        for(int i = 0; i < kette.size(); i++) {
            s += kette.get(i).toString();
            s += "\n";
        }
        return s;
    }
}

