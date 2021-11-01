 
import java.lang.Math;

public class Wettlauf {
    private Laeufer[] laeuferFeld;

    public Wettlauf(int _num) {
        laeuferFeld = new Laeufer[_num];

        for(int i = 0; i < laeuferFeld.length; i++) 
        {
            float zeit = (float)Math.random() * 60;
            laeuferFeld[i] = new Laeufer("Jens", zeit, zeit < 30);
        }
    }

    public Laeufer getSchnellsterLaeufer() 
    {
        Laeufer schnellsterLaeufer = laeuferFeld[0];
        for (int i = 1; i < laeuferFeld.length; i++)
        {
            if(laeuferFeld[i].getZeit() < schnellsterLaeufer.getZeit())
            {
                schnellsterLaeufer = laeuferFeld[i];
            }
        }
        return schnellsterLaeufer;
    }

    public Laeufer getLangsamsterLaeufer() 
    {
        Laeufer langsamsterLaeufer = laeuferFeld[0];
        for (int i = 1; i < laeuferFeld.length; i++)
        {
            if(laeuferFeld[i].getZeit() > langsamsterLaeufer.getZeit())
            {
                langsamsterLaeufer = laeuferFeld[i];
            }
        }
        return langsamsterLaeufer;
    }

    public float getDurchschnittszeit() 
    {
        float summe = 0;
        for (int i = 0; i < laeuferFeld.length; i++) 
        {
            summe += laeuferFeld[i].getZeit();
        }

        return summe / laeuferFeld.length;
    }
}