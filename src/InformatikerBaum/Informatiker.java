 /**
 * <p>Qualitaets- und UnterstuetzungsAgentur - Landesinstitut fuer Schule, Materialien zum schulinternen Lehrplan Informatik SII</p>
 *
 * @version 2014-03-13
 */
/**
 * 03.03.2011
 */
public class Informatiker {
  private String name;
  private String gebDatum;

  public Informatiker(String pName, String pDatum) {
    name = pName;
    gebDatum = pDatum;
  }
  
  public String gibName() {
    return name;
  }

  public String toString() {
    return name + " *" + gebDatum;
  }
}
