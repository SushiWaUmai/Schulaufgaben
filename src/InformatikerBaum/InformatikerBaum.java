/**
 * <p>Qualitaets- und UnterstuetzungsAgentur - Landesinstitut fuer Schule, Materialien zum schulinternen Lehrplan Informatik SII</p>
 *
 * @version 2014-03-13 / f�r LK Info adaptiert
 */
/**
 * // erg�nze Code
 */
public class InformatikerBaum {
  private BinaryTree<Informatiker> baum;

  public InformatikerBaum() {
    // rufe Konstruktor auf und weise dem baum Speicherplatz zu
    baum = new BinaryTree<Informatiker>();
  }

  public void ergaenze(String pName, String pDatum) {
    // rufe Methode zum Einfuegen auf und �bergib die Parameter, inklusive
    // attribut baum
  
    fuegeEin(baum, pName, pDatum);
  }

  private void fuegeEin(
    BinaryTree<Informatiker> b,
    String pName,
    String pDatum
  ) {
    // �bersetze in Code
    // wenn der baum leer ist, dann
    // erschaffe ein neues Objekt der Klasse Informatiker mit obigen//
    // Parametern;
    // setze Inhalt im Wurzel Knoten auf neues Objekt
    // sonst
    // belege Objekt der Klasse informatiker mit Wurzelinhalt
    // wenn Parameter pName verglichen mit Name des aktuellen Informatikerobjektes
    // kleiner als Null ist (lexikografisch kleiner als Wurzel)
    // dann rufe Methode einfuegen f�r linken Teilbaum
    //     mit Parametern: linker Teilbaum, pName, PDatum auf
    //  sonst
    //      wenn Parameter pName verglichen mit Name des aktuellen Informatikerobjektes
    // gr��er als Null ist (lexikografisch gr��er als Wurzel)
    // dann rufe Methode einfuegen f�r rechten Teilbaum
    //     mit Parametern: rechter Teilbaum, pName, PDatum auf
    //  sonst gib Konsoleninfo: Name schon vorhanden

    if (b.isEmpty()) {
      Informatiker neuerInformatiker = new Informatiker(pName, pDatum);
      b.setContent(neuerInformatiker);
    } else {
      Informatiker aktuellerInformatiker = (Informatiker) b.getContent();
      if (pName.compareTo(aktuellerInformatiker.gibName()) < 0) {
        fuegeEin(b.getLeftTree(), pName, pDatum);
      } else if (pName.compareTo(aktuellerInformatiker.gibName()) > 0) {
        fuegeEin(b.getRightTree(), pName, pDatum);
      } else {
        System.out.println("Name schon vorhanden");
      }
    }
  }

  public String suche(String pName) {
    // gib ergebnis der Methode baumSuche auf aktuellem Baum und pName zurueck
    return baumSuche(baum, pName);
  }

  private String baumSuche(BinaryTree<Informatiker> b, String pName) {
    // wenn der Baum leer ist dann
    //        gib Zeichenkette: --- zurueck
    // sonst
    //    deklariere Objekt der Klasse INformatik und belege mit wurzel
    //    wenn Parameter pName verglichen mit Name des InformatikerObjektes
    //          kleiner Null ist (lexikografisch kleiner als Wurzel
    //        dann f�hre baumSuche rekursiv auf linkem Teilbaum fort
    //        sonst
    //          wenn Parameter pName verglichen mit Name des InformatikerObjektes
    //          gr��er Null ist (lexikografisch kleiner als Wurzel
    //            dann f�hre baumSuche rekursiv auf rechtem Teilbaum fort
    //            sonst // pName ist verglichen mit Name des Informatiker gleich Null
    //                verwandle InformatikObjekt in eine  Zeichenkette und
    //                gib diese zur�ck

    if (b.isEmpty()) {
      return "---";
    } else {
      Informatiker aktuellerInformatiker = (Informatiker) b.getContent();
      if (pName.compareTo(aktuellerInformatiker.gibName()) < 0) {
        return baumSuche(b.getLeftTree(), pName);
      } else if (pName.compareTo(aktuellerInformatiker.gibName()) > 0) {
        return baumSuche(b.getRightTree(), pName);
      } else {
        return aktuellerInformatiker.toString();
      }
    }
  }

  public String zeigeAlle() {
    // gib Ergebnis der methode durchlauf auf aktuellen Baum zurueck
    return durchlaufe(baum);
  }

  private String durchlaufe(BinaryTree<Informatiker> b) {
    String aktuell = "";
    String links = "";
    String rechts = "";
    //  wenn der binaerbaum nicht leer ist
    // setze: links: ergebnis des durchlaufens der linken Teilbaumes
    // setze: rechts: ergebnis des durchlaufens der rechten Teilbaumes
    // setze aktuell: aktueller Wurzelinhalt in einen String verwandelt
    // gib Kombination auf den drei Strings zurueck -
    // Kommentiere die gewahelte Traversierung oder adaptiere entsprechend

    if(!b.isEmpty()) {
      links = durchlaufe(b.getLeftTree());
      rechts = durchlaufe(b.getRightTree());
      aktuell = ((Informatiker) b.getContent()).toString();

      return aktuell + " " + links + " " + rechts;
    }

    return "";
  }

  public BinaryTree<Informatiker> gibBaum() {
    // gib attribut baum zurueck
    return baum;
  }
}
