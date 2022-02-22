public class Simulation {
    public static void main(String[] args) {
        Lichtgitter gitter = new Lichtgitter();
        for (int i = 0 ; i < 10 ; i++) {
            Lichterkette kette = new Lichterkette();
            gitter.addLichterkette(kette);
            for(int j = 0 ; j < 10 ; j++) {
                LED led = new LED();
                kette.addLED(led);
            }
        }

        gitter.leuchten3();

        System.out.println(gitter);
    }
}
