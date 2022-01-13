public class MeinUmgekehrt {
    private Queue<Character> zeichenFolge;
    private Stack<Character> zeichenStapel;
    private String inputString;

    public MeinUmgekehrt(String _inputString) {
        zeichenFolge = new Queue<Character>();
        zeichenStapel = new Stack<Character>();
        inputString = _inputString;
    }

    public void eingabe(Character i) {
        zeichenFolge.enqueue(i);
        System.out.println("Die folgende Zeichen werden an die Zeichenfolge angehaengt:" + i.toString());
    }

    public void verwandle() {
        Character zahl;
        int zaehler = 1;
        System.out.println("Die folgende Zeichen werden in den Zeichenstapel eingefügt:");
        while (!zeichenFolge.isEmpty()) {
            zahl = (Character) zeichenFolge.front();
            System.out.println(zaehler + ".te Zeichen : " + zahl.toString());
            zeichenFolge.dequeue();
            zeichenStapel.push(zahl);
            zaehler++;
        }
    }

    public void ausgabe() {
        Character zahl;
        int zaehler = 1;
        System.out.println("Die folgende Zeichen werden aus dem Zeichenstapel gelesen:");
        while (!zeichenStapel.isEmpty()) {
            zahl = (Character) zeichenStapel.top();
            System.out.println(zaehler + ".te Zeichen : " + zahl.toString());
            zeichenStapel.pop();
            zeichenFolge.enqueue(zahl);
            zaehler++;
        }
    }

    public void simuliere() {
        for (int i = 0; i < inputString.length(); i++) {
            char z = inputString.charAt(i);
            Character zZahl = new Character(z);
            eingabe(zZahl);
        }
        verwandle();
        ausgabe();
    }
}
