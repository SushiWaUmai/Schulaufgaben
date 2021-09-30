package Waggons;

public class Verkehr {

    public static void main(String args[]){
        test(); 
    }
    
    private static void test() {
        Transportwagen tw; Gueterwagen gw1, gw2; Flachwagen fw;
        gw1 = new Gueterwagen();
        tw = gw1;
        // gw2 = tw;
        gw2 = (Gueterwagen)tw;
        // fw = (Flachwagen)gw1;
        fw = (Flachwagen)tw;
    }

    private static void simuliere1() {
        
    }

    private static void simuliere2() {

    }
}
