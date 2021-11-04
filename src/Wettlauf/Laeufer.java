public class Laeufer {
    private String name;
    private float zeit;
    private boolean qualifiziert;

    public Laeufer(String _name, float _zeit, boolean _qualifiziert) {
        name = _name;
        zeit = _zeit;
        qualifiziert = _qualifiziert;
    }

    public String getName() { return name; }
    public float getZeit() { return zeit; }
    public boolean getQualifiziert() { return qualifiziert; }

    public void setName(String _name) { name = _name; }
    public void setZeit(float _zeit) { zeit = _zeit; }
    public void setQualifiziert(boolean _qualifiziert) { qualifiziert = _qualifiziert; }

    public String toString() {
        return "Name: " + name + "\nZeit: " + zeit + "\nQualifiziert: " + qualifiziert;
    }
}
