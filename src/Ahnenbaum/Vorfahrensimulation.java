/**
 * Beschreiben Sie hier die Klasse Vorfahrensimulation.
 * 
 * @author Eugene Matsumura
 * @version 24.03.2022
 *          Klasse Vorfahrensimulation
 */
public class Vorfahrensimulation
{
    public Vorfahrensimulation()
    {
        Ahnenbaum ahnenbaum = new Ahnenbaum();

        System.out.println("Inorder:");
        ahnenbaum.TraverseInorder();

        System.out.println("Preorder:");
        ahnenbaum.TraversePreorder();

        System.out.println("Postorder:");
        ahnenbaum.TraversePostorder();
    }
}
