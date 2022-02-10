public class Textdatei {

    private String dateiname;
    private BetterList<Zeile> zeilen;

    public Textdatei(String dateiname) {
        this.dateiname = dateiname;
        this.zeilen = new BetterList<>();
    }

    public void zeilenTauschen(int index1, int index2) {
        zeilen.swap(index1, index2);
    }

    public void textImportieren(String text) {
        String[] zeilen = text.split("\n");
        for (int i = 1; i < zeilen.length; i++) {
            this.zeilen.append(new Zeile(zeilen[i - 1], i, this.zeilen.get(i)));
        }
    }

    public void zeileHinzufuegen(String zeile) {
        this.zeilen.append(new Zeile(zeile, this.zeilen.size() + 1, this.zeilen.get(this.zeilen.size())));
    }

    public String textAusgeben() {
        String result = "";
        for (int i = 0; i < this.zeilen.size(); i++) {
            result += this.zeilen.get(i).getInhalt() + "\n";
        }
        return result;
    }

    public int zeilenLeange() {
        return zeilen.size();
    }

    public String getDateiname() {
        return dateiname;
    }

    public void setDateiname(String dateiname) {
        this.dateiname = dateiname;
    }

    public List<Zeile> getZeilen() {
        return zeilen;
    }

    public void setZeilen(BetterList<Zeile> zeilen) {
        this.zeilen = zeilen;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dateiname == null) ? 0 : dateiname.hashCode());
        result = prime * result + ((zeilen == null) ? 0 : zeilen.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Textdatei other = (Textdatei) obj;
        if (dateiname == null) {
            if (other.dateiname != null)
                return false;
        } else if (!dateiname.equals(other.dateiname))
            return false;
        if (zeilen == null) {
            if (other.zeilen != null)
                return false;
        } else if (!zeilen.equals(other.zeilen))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Textdatei [dateiname=" + dateiname + ", zeilen=" + zeilen + "]";
    }

}