public class Simulation {

    public static int BerechneWert(Stack<Muenze> s) {
        int sum = 0;
        while(!s.isEmpty()) {
            Muenze c = s.top();
            s.pop();
            sum += c.getWert();
        }
        return sum;
    }

    public static void main(String[] args) {
        Stack<Muenze> coins = new Stack<>();

        System.out.println("20 Muenzen werden generiert...");
        for(int i = 0; i < 20; i++) {
            coins.push(new Muenze());
        }

        System.out.println("Muenzen werden sotiert...");
        Stack<Muenze> cent10 = new Stack<>();
        Stack<Muenze> cent20 = new Stack<>();
        Stack<Muenze> cent50 = new Stack<>();
        Stack<Muenze> euro1 = new Stack<>();
        Stack<Muenze> euro2 = new Stack<>();

        while(!coins.isEmpty()) {
            Muenze coin = coins.top();
            coins.pop();
            int wert = coin.getWert();

            if (wert == 10) {
                cent10.push(coin);
            }
            else if (wert == 20) {
                cent20.push(coin);
            }
            else if (wert == 50) {
                cent50.push(coin);
            }
            else if (wert == 100) {
                euro1.push(coin);
            }
            else if (wert == 200) {
                euro2.push(coin);
            }
        }

        System.out.println("Der 10 Cent Stapel ist: " + BerechneWert(cent10) + "ct wert");
        System.out.println("Der 20 Cent Stapel ist: " + BerechneWert(cent20) + "ct wert");
        System.out.println("Der 50 Cent Stapel ist: " + BerechneWert(cent50) + "ct wert");
        System.out.println("Der 1 Euro Stapel ist: " + BerechneWert(euro1) + "ct wert");
        System.out.println("Der 10 Euro Stapel ist: " + BerechneWert(euro2) + "ct wert");
    }
}
