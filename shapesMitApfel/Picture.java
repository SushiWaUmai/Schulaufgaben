
/**
 * Beschreiben Sie hier die Klasse Picture.
 * 
 * @Denise Schmitz 
 * @31.01.2021
 */
public class Picture
{
   Circle sonne, mond;

   public Picture()
   {
      sonne = new Circle();
      sonne.moveUp();
      mond  = new Circle();
   } 

   public void makeVisible()
   {
      sonne.makeVisible();
      mond.makeVisible();
   } 
} 
