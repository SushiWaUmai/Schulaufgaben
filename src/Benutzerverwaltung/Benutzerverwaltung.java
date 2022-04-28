public class Benutzerverwaltung {
    private BinarySearchTree<Benutzerprofil> benutzer;

    // Konstruktor
    public Benutzerverwaltung() {
        this.benutzer = new BinarySearchTree<Benutzerprofil>();
    }

    public void neuenNutzerAnlegen(String benutzername, String pw) {
        Benutzerprofil bp = new Benutzerprofil(benutzername, pw);
        this.benutzer.insert(bp);
    }

    public void nutzerLoeschen(String benutzername, String pw) {
        Benutzerprofil bp = new Benutzerprofil(benutzername, pw);
        this.benutzer.remove(bp);
    }

    public boolean profilVorhanden(String benutzername, String pw) {
        Benutzerprofil bp = new Benutzerprofil(benutzername, pw);
        return this.benutzer.search(bp) != null;
    }
}