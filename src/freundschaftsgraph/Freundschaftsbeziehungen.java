/*
 * Übungsaufgabe zu Graphen
 */
public class Freundschaftsbeziehungen
{
    private Graph beziehungen;

    public Freundschaftsbeziehungen()
    {
        beziehungen=new Graph();
        freundschaftsGraphErzeugen();
    }

    /* 
     * Teilaufgabe b: Freundschaftsgraph erzeugen
     */
    public void freundschaftsGraphErzeugen(){
        Vertex susi =new Vertex("Susi");
        Vertex karl =new Vertex("Karl");
        Vertex jens = new Vertex("Jens");
        Vertex lisa = new Vertex("Lisa");
        Vertex merle = new Vertex("Merle");

        beziehungen.addVertex(susi);
        beziehungen.addVertex(karl);
        beziehungen.addVertex(jens);
        beziehungen.addVertex(lisa);
        beziehungen.addVertex(merle);

        beziehungen.addEdge(new Edge(susi,karl,1));
        beziehungen.addEdge(new Edge(susi, lisa, 1));
        beziehungen.addEdge(new Edge(susi, merle, 1));
        beziehungen.addEdge(new Edge(karl, jens, 1));
        beziehungen.addEdge(new Edge(karl, lisa, 1));
        beziehungen.addEdge(new Edge(karl, merle, 1));
        beziehungen.addEdge(new Edge(lisa, merle,1 ));

    }

    /*
     * Teilaufgabe c: Bestehen einer Freundschaft prüfen
     */
    public boolean sindBefreundet(String name01, String name02){
        Vertex first = beziehungen.getVertex(name01);
        Vertex second = beziehungen.getVertex(name02);
        return first!=null && second!=null && beziehungen.getEdge(first, second)!=null;
    }

    /*
     * Teilaufgabe d
     */
    private int getGrad(Vertex person){
        if(person==null)return 0;
        List<Vertex> freunde = beziehungen.getNeighbours(person);
        int count = 0;
        freunde.toFirst();
        while(freunde.hasAccess()) {
            count++;
            freunde.next();
        }
        return count;
    }

    /* 
     * Hilfsmethode für d)
     */
    public int getGrad(String pName){
        Vertex person=beziehungen.getVertex(pName);
        return getGrad(person);
    }

    /* 
     * Teilaufgabe e
     */
    public int getMinGrad(){
        int kleinster = Integer.MAX_VALUE;
        List<Vertex> personen = beziehungen.getVertices();
        personen.toFirst();
        while(personen.hasAccess()) {
            if(getGrad(personen.getContent())<kleinster) {
            kleinster = getGrad(personen.getContent());
            }   
            personen.next();
        }
        return kleinster;
    }
}

