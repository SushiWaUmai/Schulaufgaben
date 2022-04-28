public class Benutzerprofil implements ComparableContent<Benutzerprofil> {
    private String benutzername, pw;

    public Benutzerprofil(String benutzername, String pw) {
        this.benutzername = benutzername;
        this.pw = pw;
    }

    public String getBenutzername() {
        return benutzername;
    }
    
    public boolean isGreater(Benutzerprofil p) {
        return this.benutzername.compareTo(p.benutzername) > 0;
    }

    public boolean isEqual(Benutzerprofil p) {
        return this.benutzername.compareTo(p.benutzername) == 0;
    }

    public boolean isLess(Benutzerprofil p) {
        return this.benutzername.compareTo(p.benutzername) < 0;
    }
}
