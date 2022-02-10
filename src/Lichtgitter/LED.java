public class LED {
    private boolean leuchtet;

    public LED() {
        leuchtet = false;
    }

    public void lichtAn() {
        leuchtet = true;
    }

    public void lichtAus() {
        leuchtet = false;
    }

    public boolean getLeuchtet() {
        return leuchtet;
    }
}
