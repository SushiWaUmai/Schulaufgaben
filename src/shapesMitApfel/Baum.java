import java.lang.*;

public class Baum
{
    // Objekte
    private Apfel apfel1;
    private Apfel apfel2;
    private Apfel apfel3;
    
    private Baum baumLinks;
    private Baum baumRechts;
    
    private Square stamm;
    private Circle blaetter;
    
    // primitive Variablen
    private int groesseBaum;
    private int baumkrone;
    
    // Default Konstruktor
    public Baum()
    {
        this(100, 50, 250, 250, 250);
    }
    
    // Konstruktor
    public Baum(int stammBreite, int apfelDurchmesser, int baumkroneDurchmesser, int xPosition, int yPosition)
    {
        // initialisiert die objekte in der Klasse
        initStamm(stammBreite, baumkroneDurchmesser, xPosition, yPosition);
        initBlaetter(baumkroneDurchmesser, xPosition, yPosition);
        initApfel(apfelDurchmesser, baumkrone, xPosition, yPosition);

        // setzt die privaten variablen
        groesseBaum = baumkroneDurchmesser + stammBreite / 2;
        baumkrone = baumkroneDurchmesser;
    }
    
    // Konstruktor mit groesseBaum und baumkrone
    public Baum(int baumGroesse, int baumkroneDurchmesser, int xPosition, int yPosition)
    {
        // Rechnet stamm breite und apfel durchmesser von anderen parameter aus
        this(2 * (baumGroesse - baumkroneDurchmesser), baumkroneDurchmesser / 5, baumkroneDurchmesser, xPosition, yPosition);
    }    
    
    // Initialisiert Apfel
    private void initApfel(int apfelDurchmesser, int bleatterDurchmesser, int xPos, int yPos)
    {
        // konstruiert die apfel und setzt sie auf die position 0, 0
        apfel1 = createApfel(apfelDurchmesser);
        apfel2 = createApfel(apfelDurchmesser);
        apfel3 = createApfel(apfelDurchmesser);
        
        // Bewegt apfel in die Mitte
        apfel1.moveHorizontal(xPos - apfelDurchmesser / 2);
        apfel1.moveVertical(yPos - apfelDurchmesser / 2);
        apfel2.moveHorizontal(xPos - apfelDurchmesser / 2);
        apfel2.moveVertical(yPos - apfelDurchmesser / 2);
        apfel3.moveHorizontal(xPos - apfelDurchmesser / 2);
        apfel3.moveVertical(yPos - apfelDurchmesser / 2);
        
        // setzt den Apfel auf eine zufaellig generierte position
        double a1 = getRandomAngle();
        double a2 = getRandomAngle();
        double a3 = getRandomAngle();
        
        // berechnet min und max radius
        double maxRadius = bleatterDurchmesser / 2 - apfelDurchmesser;
        double minRadius = bleatterDurchmesser / 4;
        
        // generiert zufaelligen Radius
        double r1 = getRandomRadius(minRadius, maxRadius);
        double r2 = getRandomRadius(minRadius, maxRadius);
        double r3 = getRandomRadius(minRadius, maxRadius);
        
        // Trigonometrie um polar Koordinaten zu kartesische Koordinaten umzuwandeln
        // Setzt die position der Aepfel
        apfel1.moveVertical(getRandomApfelYposition(a1, r1));
        apfel2.moveVertical(getRandomApfelYposition(a2, r2));
        apfel3.moveVertical(getRandomApfelYposition(a3, r3));
        
        apfel1.moveHorizontal(getRandomApfelXposition(a1, r1));
        apfel1.moveHorizontal(getRandomApfelXposition(a2, r2));
        apfel1.moveHorizontal(getRandomApfelXposition(a3, r3));
    }
    
    // Initialisiert Stamm
    private void initStamm(int breite, int blaetterDurchmesser, int xPos, int yPos)
    {
        // konstuiert den Stamm und setzt sie auf die position 0, 0
        stamm = createSquare();
        stamm.changeColor("black");
        stamm.changeSize(breite);
        
        // Bewegt blaetter in die richtige position
        stamm.moveHorizontal(xPos - breite / 2);
        stamm.moveVertical(yPos - breite / 2 + blaetterDurchmesser / 2);
        
        stamm.makeVisible();
    }
    
    // Initialisiert Blaetter
    private void initBlaetter(int blaetterDurchmesser, int xPos, int yPos)
    {
        // konstruiet die Blaetter und setzt sie auf die position 0, 0
        blaetter = createCircle();
        blaetter.changeColor("green");
        blaetter.changeSize(blaetterDurchmesser);
        
        // Bewegt blaetter in die richtige position
        blaetter.moveHorizontal(xPos - blaetterDurchmesser / 2);
        blaetter.moveVertical(yPos - blaetterDurchmesser / 2);
        
        blaetter.makeVisible();
    }

    private double getRandomRadius(double min, double max)
    {
        return Math.random() * (max - min) + min;
    }
    
    private double getRandomAngle()
    {
        return Math.random() * Math.PI * 2;
    }
    
    private int getRandomApfelXposition(double angle, double radius)
    {
        return (int)(Math.cos(angle) * radius);
    }
    
    private int getRandomApfelYposition(double angle, double radius)
    {
        return (int)(Math.sin(angle) * radius);
    }
    
    // bewegt Baum in vertikale Richtung
    public void bewegeVertikal(int distance)
    {
        apfel1.moveVertical(distance);
        apfel2.moveVertical(distance);
        apfel3.moveVertical(distance);
        
        stamm.moveVertical(distance);
        blaetter.moveVertical(distance);
    }
    
    // bewegt Baum in horizontale Richtung
    public void bewegeHorizontal(int distance)
    {
        apfel1.moveHorizontal(distance);
        apfel2.moveHorizontal(distance);
        apfel3.moveHorizontal(distance);
        
        stamm.moveHorizontal(distance);
        blaetter.moveHorizontal(distance);
    }
    
    // bewegt linken Baum Horizontal
    public void bewegeLinkenBaumHorizontal(int distance)
    {
        baumLinks.bewegeHorizontal(distance);
    }
    
    // bewegt linken Baum Vertikal
    public void bewegeLinkenBaumVertikal(int distance)
    {
        baumLinks.bewegeVertikal(distance);
    }

    // bewegt rechten Baum Horizontal
    public void bewegeRechtenBaumHorizontal(int distance)
    {
        baumRechts.bewegeHorizontal(distance);
    }

    // bewegt rechten Baum Vertikal
    public void bewegeRechtenBaumVertikal(int distance)
    {
        baumRechts.bewegeVertikal(distance);
    }
    
    // Apfel waechst um growAmount
    public void apfelWachsen(int growAmount)
    {
        int neuerDurchmesser = apfel1.getDurchmesser() + growAmount;
        apfel1.setDurchmesser(neuerDurchmesser);
        apfel2.setDurchmesser(neuerDurchmesser);
        apfel3.setDurchmesser(neuerDurchmesser);
    }
    
    // Get methoden fuer die privaten Variablen
    public int getDurchmesserBaumkrone()
    {
        return baumkrone;
    }
    
    public int getGroesseBaum()
    {
        return groesseBaum;
    }
    
    public Baum getBaumLinks() 
    { 
        return baumLinks; 
    }
    
    public Baum getBaumRechts() 
    { 
        return baumRechts; 
    }
    
    // Baum kennen Methoden
    public void lerneKennenLinks(Baum baum)
    {
        baumLinks = baum;
    }
    
    public void lerneKennenRechts(Baum baum)
    {
        baumRechts = baum;
    }
    
    // Schlechte Default Position fix
    private Apfel createApfel(int size)
    {
        Apfel result = new Apfel(size);
        result.moveHorizontal(-20);
        result.moveVertical(-60);
        return result;
    }
    
    private Circle createCircle()
    {
        Circle result = new Circle();
        result.moveHorizontal(-20);
        result.moveVertical(-60);
        return result;
    }
    
    private Square createSquare()
    {
        Square result = new Square();
        result.moveHorizontal(-60);
        result.moveVertical(-50);
        return result;
    }
}
