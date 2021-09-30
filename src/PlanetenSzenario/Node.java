package PlanetenSzenario;

import java.util.ArrayList;

public class Node  
{
    public static Node[][] allNodes;
    public int x;
    public int y;
    public int gCost;
    public int hCost;
    public boolean traversable;
    public Node parent;
    
    public Node(int x, int y, boolean traversable)
    {
        this.x = x;
        this.y = y;
        this.traversable = traversable;
    }
    
    public int fCost()
    {
        return gCost + hCost;
    }
    
    public ArrayList<Node> getNeibours()
    {
        ArrayList<Node> result = new ArrayList<Node>();
        
        if (inRange(x + 1, y))
            result.add(allNodes[x + 1][y]);
        if (inRange(x - 1, y))
            result.add(allNodes[x - 1][y]);
        if (inRange(x, y + 1))
            result.add(allNodes[x][y + 1]);
        if (inRange(x, y - 1))
            result.add(allNodes[x][y - 1]);
            
        return result;
    }
    
    private boolean inRange(int x, int y)
    {
        return x >= 0 && x < Planet.WIDTH && y >= 0 && y < Planet.HEIGHT;
    }
}
