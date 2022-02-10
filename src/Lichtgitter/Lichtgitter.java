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

    public void leuchten1NormalList() {
        kette.toFirst();
        while(kette.getContent() != null) {
            kette.getContent().leuchten1();
            kette.next();
        }
    }

    public void leuchten2() {
        for (int i = 0; i < kette.size(); i++) {
            kette.get(i).leuchten2();
        }
    }

    public void leuchten2NormalList() {
        kette.toFirst();
        while(kette.getContent() != null) {
            kette.getContent().leuchten2();
            kette.next();
        }
    }

    public void leuchten3() {
        for (int i = 0; i < kette.size(); i++) {
            kette.get(i).leuchten3();
        }
    }

    public void leuchten3NormalList() {
        kette.toFirst();
        while(kette.getContent() != null) {
            kette.getContent().leuchten3();
            kette.next();
        }
    }
}

