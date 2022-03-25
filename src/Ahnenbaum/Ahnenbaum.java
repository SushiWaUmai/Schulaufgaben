/**
 * @author Eugene Matsumura
 * @version 24.03.2022
 *          Klasse Ahnenbaum
 */
public class Ahnenbaum {

    /**
     * Ahnenbaum ist ein BinaryTree mit dem ContentType Ahne
     */
    private BinaryTree<Ahne> ahnenbaum;

    /**
     * Konstruktor für Objekte der Klasse Ahne
     */
    public Ahnenbaum() {
        // Initialisierung des Baumes

        // Gross Eltern
        BinaryTree<Ahne> grossmutter0 = new BinaryTree<Ahne>(new Ahne('w', 1930));
        BinaryTree<Ahne> grossvater0 = new BinaryTree<Ahne>(new Ahne('m', 1930));
        BinaryTree<Ahne> grossmutter1 = new BinaryTree<Ahne>(new Ahne('w', 1930));
        BinaryTree<Ahne> grossvater1 = new BinaryTree<Ahne>(new Ahne('m', 1930));

        // Eltern
        BinaryTree<Ahne> mutter = new BinaryTree<Ahne>(new Ahne('w', 1960), grossmutter1, grossvater1);
        BinaryTree<Ahne> vater = new BinaryTree<Ahne>(new Ahne('m', 1960), grossmutter0, grossvater0);

        // Ich
        ahnenbaum = new BinaryTree<Ahne>(new Ahne('m', 2003), mutter, vater);
    }

    /**
     * Gibt den Ahnenbaum inorder aus
     */
    public void TraverseInorder() {
        inorder(ahnenbaum);
    }

    /**
     * Gibt den Ahnenbaum inorder aus
     * 
     * @param ahnenbaum Baum, der ausgegeben werden soll
     */
    private void inorder(BinaryTree<Ahne> ahnenbaum) {
        if (!ahnenbaum.getLeftTree().isEmpty()) {
            inorder(ahnenbaum.getLeftTree());
        }
        System.out.println(ahnenbaum.getContent());
        if (!ahnenbaum.getRightTree().isEmpty()) {
            inorder(ahnenbaum.getRightTree());
        }
    }

    /**
     * Gibt den Ahnenbaum postorder aus
     */
    public void TraversePreorder() {
        // Ruft die rekursive Methode preorder auf
        preorder(ahnenbaum);
    }

    /**
     * Rekursive Methode zum Ausgeben des Baumes in postorder
     * 
     * @param ahnenbaum Baum, der ausgegeben werden soll
     */
    private void preorder(BinaryTree<Ahne> ahnenbaum) {
        System.out.println(ahnenbaum.getContent());
        if (!ahnenbaum.getLeftTree().isEmpty()) {
            preorder(ahnenbaum.getLeftTree());
        }
        if (!ahnenbaum.getRightTree().isEmpty()) {
            preorder(ahnenbaum.getRightTree());
        }
    }

    /**
     * Gibt den Ahnenbaum postorder aus
     */
    public void TraversePostorder() {
        postorder(ahnenbaum);
    }

    /**
     * Rekursive Methode zum Ausgeben des Baumes in postorder
     * 
     * @param ahnenbaum Baum, der ausgegeben werden soll
     */
    private void postorder(BinaryTree<Ahne> ahnenbaum) {
        if (!ahnenbaum.getLeftTree().isEmpty()) {
            postorder(ahnenbaum.getLeftTree());
        }
        if (!ahnenbaum.getRightTree().isEmpty()) {
            postorder(ahnenbaum.getRightTree());
        }
        System.out.println(ahnenbaum.getContent());
    }
}
