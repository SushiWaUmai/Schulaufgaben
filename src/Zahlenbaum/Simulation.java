
/**
 *  Simulation des Zahlbaumes
 * 
 * @author LK INfo
 * @version Februar 2020
 */
public class Simulation
{
  // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
  private Zahlbaum dieserZahlbaum;

  /**
   * Konstruktor für Objekte der Klasse Simulation
   */
  public Simulation()
  {
    // aufbau Zahlbaum S. 194
    dieserZahlbaum = new Zahlbaum();
    
    
  }

  /**
   * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
   * 
   * @param  y  ein Beispielparameter für eine Methode
   * @return    die Summe aus x und y
   */
  public void simuliere2()
  {
    // tragen Sie hier den Code ein
    System.out.println("Ausgabe in PreOrder:");
    dieserZahlbaum.besuchePre(dieserZahlbaum.getZahlbaum2());
    System.out.println("Ausgabe in InOrder:");
    dieserZahlbaum.besucheIn(dieserZahlbaum.getZahlbaum2());
    System.out.println("Ausgabe in PostOrder:");
    dieserZahlbaum.besuchePost(dieserZahlbaum.getZahlbaum2());
    
  }
  
  public void simuliere1()
  {
    // tragen Sie hier den Code ein
    System.out.println("Ausgabe in PreOrder:");
    dieserZahlbaum.besuchePre(dieserZahlbaum.getZahlbaum());
    System.out.println("Ausgabe in InOrder:");
    dieserZahlbaum.besucheIn(dieserZahlbaum.getZahlbaum());
    System.out.println("Ausgabe in PostOrder:");
    dieserZahlbaum.besuchePost(dieserZahlbaum.getZahlbaum());
    
  }
  public void ausprobieren()
  { 
    dieserZahlbaum.wasTueIch(dieserZahlbaum.getZahlbaum2());
    dieserZahlbaum.wasTueIch(dieserZahlbaum.getZahlbaum());
  }  
}
