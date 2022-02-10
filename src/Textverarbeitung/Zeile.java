public class Zeile {

    private String inhalt;
    private int zeilenNummber;
    private Zeile next;

    public Zeile(String inhalt, int zeilenNummber, Zeile next) {
        this.inhalt = inhalt;
        this.zeilenNummber = zeilenNummber;
        this.next = next;
    }

    public Zeile getNext() {
        return next;
    }

    public void setNext(Zeile next) {
        this.next = next;
    }

    public String getInhalt() {
        return inhalt;
    }

    public void setInhalt(String inhalt) {
        this.inhalt = inhalt;
    }

    public int getZeilenNummber() {
        return zeilenNummber;
    }

    public void setZeilenNummber(int zeilenNummber) {
        this.zeilenNummber = zeilenNummber;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((inhalt == null) ? 0 : inhalt.hashCode());
        result = prime * result + ((next == null) ? 0 : next.hashCode());
        result = prime * result + zeilenNummber;
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
        Zeile other = (Zeile) obj;
        if (inhalt == null) {
            if (other.inhalt != null)
                return false;
        } else if (!inhalt.equals(other.inhalt))
            return false;
        if (next == null) {
            if (other.next != null)
                return false;
        } else if (!next.equals(other.next))
            return false;
        if (zeilenNummber != other.zeilenNummber)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Zeile [inhalt=" + inhalt + ", next=" + next + ", zeilenNummber=" + zeilenNummber + "]";
    }
}
