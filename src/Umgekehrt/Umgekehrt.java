
/**
 * Klasse Umgekehrt.
 * GK Informatik
 * Donnerstag, 14. November 2019
 */

public class Umgekehrt // Version1
{
    private int anzahlZahlen;
    private Queue<IntegerPP> zahlenfolge;
    private Stack<IntegerPP> zahlenstapel;

    /**
     * Konstruktor für Objekte der Klasse Umgekehrt
     */
    public Umgekehrt() // Version1
    {
        zahlenfolge = new Queue<IntegerPP>();
        zahlenstapel = new Stack<IntegerPP>();
        anzahlZahlen = 0;
    }

    public void eingabe(IntegerPP i) // Version1
    {
        zahlenfolge.enqueue(i);
        System.out.println("Die folgende Zahl wird an die Zahlenfolge angehaengt:" + i.getZahl());
    }

    public void verwandle() // Version1
    {
        IntegerPP zahl;
        int zaehler = 1;
        System.out.println("Die folgende Zahlen werden in den Zahlenstapel eingefügt:");
        while (!zahlenfolge.isEmpty()) {
            zahl = (IntegerPP) zahlenfolge.front();
            System.out.println(zaehler + ".te Zahl : " + zahl.getZahl());
            zahlenfolge.dequeue();
            zahlenstapel.push(zahl);
            zaehler++;
        }
    }

    public void ausgabe() // Version1
    {
        IntegerPP zahl;
        int zaehler = 1;
        System.out.println("Die folgende Zahlen werden aus dem Zahlenstapel gelesen:");
        while (!zahlenstapel.isEmpty()) {
            zahl = (IntegerPP) zahlenstapel.top();
            System.out.println(zaehler + ".te Zahl : " + zahl.getZahl());
            zahlenstapel.pop();
            zahlenfolge.enqueue(zahl);
            zaehler++;
        }
    }

    public void simuliere() // Version1
    {
        int aktZahl;
        while (anzahlZahlen < 10) {
            aktZahl = (int) (Math.random() * 100);
            IntegerPP zZahl = new IntegerPP(aktZahl);
            eingabe(zZahl);
            anzahlZahlen = anzahlZahlen + 1;
        }
        System.out.println("Die Zahlenfolge enthält jetzt Zahlen");
        verwandle();
        ausgabe();
    }
}
