import java.util.*;

/**
 * Beschreiben Sie hier die Klasse Zahlbaum: LB S. 194
 *
 * @author GK Info
 * @version April / Mai 2022
 */
public class Zahlbaum {
  // Attribut1: Zahlbaum Abbildung 3a; Attribut 2: Zahlbaum2 aufgabe3b)
  private BinaryTree<Integer> meinZahlbaum, meinZahlbaum2;

  /**
   * Konstruktor für Objekte der Klasse Zahlbaum
   */
  public Zahlbaum() {
    // Instanzvariable initialisieren
    meinZahlbaum = erschaffeBaum();
    meinZahlbaum2 = erschaffeBaum2();
  }

  public BinaryTree<Integer> erschaffeBaum2() {
    return fromOrder(
      new int[] { 1, 2, 4, 3, 5, 6, 7 },
      new int[] { 4, 2, 1, 6, 5, 7, 3 }
    );
  }

  public BinaryTree<Integer> fromOrder(int[] pre, int[] in) {
    if (pre.length == 0) {
      return null;
    }

    int rootIndex = 0;
    for (int i = 0; i < in.length; i++) {
      if (in[i] == pre[0]) {
        rootIndex = i;
        break;
      }
    }

    int[] leftIn = Arrays.copyOfRange(in, 0, rootIndex);
    int[] leftPre = Arrays.copyOfRange(pre, 1, rootIndex + 1);

    int[] rightIn = Arrays.copyOfRange(in, rootIndex + 1, in.length);
    int[] rightPre = Arrays.copyOfRange(pre, rootIndex + 1, pre.length);

    BinaryTree<Integer> root = new BinaryTree<Integer>(
      pre[0],
      fromOrder(leftPre, leftIn),
      fromOrder(rightPre, rightIn)
    );

    return root;
  }

  public BinaryTree<Integer> erschaffeBaum() {
    BinaryTree<Integer> bl3 = new BinaryTree<Integer>(3);
    BinaryTree<Integer> bl7 = new BinaryTree<Integer>(7);
    BinaryTree<Integer> bl10 = new BinaryTree<Integer>(10);
    BinaryTree<Integer> ik11 = new BinaryTree<Integer>(11, bl10, null);
    BinaryTree<Integer> ik6 = new BinaryTree<Integer>(6, null, bl7);
    BinaryTree<Integer> ik9 = new BinaryTree<Integer>(9, ik6, ik11);
    BinaryTree<Integer> w5 = new BinaryTree<Integer>(5, bl3, ik9);
    return w5;
  }

  /**
   * traversierung PreOrder
   * Besichtigt in Preorder und gibt jeweils Wurzelknoten aus
   *
   */
  public void preOrder(BinaryTree<Integer> b) {
    int zahl;
    if (!b.isEmpty()) {
      // bearbeite die Wurzel von b
      zahl = (int) b.getContent();
      System.out.println("aktueller Knoten: " + zahl);
      // falls b einen nichtleeren Teilbaum hat
      // besuche in der Preorder (linken Teilbaum von b) -
      // rekursiver Aufruf der Methode
      // ende falls

      // was ist noch zu tun ??// Konsultiere LB S. 190
      if (!b.getLeftTree().isEmpty()) {
        preOrder(b.getLeftTree());
      }
      if (!b.getRightTree().isEmpty()) {
        preOrder(b.getRightTree());
      }
    }
  }

  public void besuchePre(BinaryTree<Integer> zubesuchender) {
    preOrder(zubesuchender);
  }

  public BinaryTree<Integer> getZahlbaum() {
    return meinZahlbaum;
  }

  public BinaryTree<Integer> getZahlbaum2() {
    return meinZahlbaum2;
  }

  /**
   * traversierung InOrder
   * Besichtigt in InOrder und gibt jeweils Wurzelknoten aus
   *
   */
  public void inOrder(BinaryTree<Integer> b) {
    if (!b.getLeftTree().isEmpty()) {
      inOrder(b.getLeftTree());
    }
    System.out.println(b.getContent());
    if (!b.getRightTree().isEmpty()) {
      inOrder(b.getRightTree());
    }
  } // adaptiere von Methode preOrder

  public void besucheIn(BinaryTree<Integer> zubesuchender) {
    inOrder(zubesuchender);
  }

  /**
   * traversierung PostOrder
   * Besichtigt in PostOrder und gibt jeweils Wurzelknoten aus
   *
   */
  public void postOrder(BinaryTree<Integer> b) {
    if (!b.getLeftTree().isEmpty()) {
      postOrder(b.getLeftTree());
    }
    if (!b.getRightTree().isEmpty()) {
      postOrder(b.getRightTree());
    }
    System.out.println(b.getContent());
  } // adaptiere von Methode preOrder

  public void besuchePost(BinaryTree<Integer> zubesuchender) {
    postOrder(zubesuchender);
  }

  public void wasTueIchOrig(BinaryTree<Integer> b) {
    Stack<BinaryTree<Integer>> stapel = new Stack<BinaryTree<Integer>>();
    while (!stapel.isEmpty() || !b.isEmpty()) {
      if (!b.isEmpty()) {
        stapel.push(b);
        b = b.getLeftTree();
      } else { // Bedingung?
        b = stapel.top();
        stapel.pop();
        System.out.println(b.getContent());
        //
        b = b.getRightTree();
      }
    }
    //
  }

  /** mit dieser Erweiterung kannst du auch die Anzahl der Knoten ermitteln
   */
  public void wasTueIch(BinaryTree<Integer> b) {
    int anzNode = 0; // Variable zum Zaehlen der Knoten
    Stack<BinaryTree<Integer>> stapel = new Stack<BinaryTree<Integer>>();
    while (!stapel.isEmpty() || !b.isEmpty()) {
      if (!b.isEmpty()) {
        stapel.push(b);
        b = b.getLeftTree();
      } else { // !stapel.isEmpty(); b.isEmpty()
        b = stapel.top();
        stapel.pop();
        System.out.println("Knoten: " + b.getContent());
        anzNode++;
        // kannst du zaehlen?
        b = b.getRightTree();
      }
    }
    System.out.println("Anzahl der Knoten im Baum: " + anzNode);
  }
  // Diese Methode nimmt einen BinaryTree als parameter, durchlaeuft den Baum
  // und gibt die Knoten auf der Konsole aus.
}
