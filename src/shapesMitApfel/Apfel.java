package shapesMitApfel;
/**
 * Beschreiben Sie hier die Klasse Apfel.
 * 
 * @Denise Schmitz
 * @04.02.2021
 */
public class Apfel
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    int durchmesser;
    Circle fruchtfleisch;
    Square stiel;

    /**
     * Konstruktor für Objekte der Klasse Apfel
     */
    public Apfel(int dm)
    {
        durchmesser=dm;
        fruchtfleisch = new Circle();
        fruchtfleisch.changeSize(durchmesser);
        fruchtfleisch.changeColor("red");
        stiel = new Square();
        stiel.changeSize(durchmesser/4);
        stiel.changeColor("black");
        stiel.moveHorizontal(-40);
        stiel.moveHorizontal(dm/2-durchmesser/8);
        stiel.moveVertical(10);
        fruchtfleisch.makeVisible();
        stiel.makeVisible();
    }
    
    public int getDurchmesser()
    {
        return durchmesser;
    }
    
    public void setDurchmesser(int dm)
    {
        int altDM=durchmesser;
        durchmesser=dm;
        fruchtfleisch.changeSize(durchmesser);
        stiel.changeSize(durchmesser/4);
        if(altDM<durchmesser){
            stiel.moveHorizontal((durchmesser-altDM)/2-(durchmesser-altDM)/8);
        }
        if(altDM>durchmesser)
        {
            stiel.moveHorizontal(-(altDM-durchmesser)/2+(altDM-durchmesser)/8);
        }
    }

    public void moveVertical(int distance)
    {
        fruchtfleisch.moveVertical(distance);
        stiel.moveVertical(distance);
    }

        public void moveHorizontal(int distance)
    {
        fruchtfleisch.moveHorizontal(distance);
        stiel.moveHorizontal(distance);
    }
    
}
