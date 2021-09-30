package PlanetenSzenario;

import java.util.ArrayList;
import java.lang.Math;

public class AStarPathfinding  
{
    public static ArrayList<Node> findPath(int startX, int startY, int endX, int endY)
    {
        Planet.instance.initNodes();
        
        ArrayList<Node> openList = new ArrayList<Node>();
        ArrayList<Node> closedList = new ArrayList<Node>();
        openList.add(Node.allNodes[startX][startY]);
        Node target = Node.allNodes[endX][endY];
        
        while (true)
        {
            if (openList.size() == 0)
                break;
            
            Node current = lowestF(openList);
            openList.remove(current);
            closedList.add(current);

            if (current == target)
                break;

            for (Node n : current.getNeibours())
            {
                if (!n.traversable || closedList.contains(n))
                    continue;
                
                int newCost = current.gCost + getDistance(current, n);
                
                if (newCost < n.gCost || !openList.contains(n))
                {
                    n.gCost = newCost;
                    n.hCost = getDistance(n, target);
                    n.parent = current;
                    if(!openList.contains(n))
                        openList.add(n);
                }
            }
        }
        
        ArrayList<Node> path = new ArrayList<Node>();
        path.add(target);
        Node n = target;
        while (n.parent != null)
        {
            path.add(n.parent);
            n = n.parent;
        }
        
        return path;
    }

    public static Node lowestF(ArrayList<Node> list)
    {
        Node result = null;
        for (Node n : list)
        {
            if(result == null || n.fCost() < result.fCost())
                result = n;
        }
        return result;
    }

    public static int getDistance(Node a, Node b)
    {
        return (int)Math.abs(a.x - b.x + a.y - b.y);
    }
}
