import greenfoot.*;
import java.util.*;

public class WorldSaver
{
    public static String saveWorld()
    {
        String saveString = "";
        List<Actor> actorInWorld = Planet.instance.getObjects(Actor.class);
        
        for (int i = 0; i < actorInWorld.size(); i++)
        {
            Actor a = actorInWorld.get(i);
            String className = a.getClass().getSimpleName();
            saveString += className + " actor" + i + " = new " + className + "();\n";
            saveString += "addObject(" + "actor" + i + ", " + a.getX() + ", " + a.getY() + ");\n";
            
            if(a.getRotation() != 0)
                saveString += "actor" + i + ".setRotation(" + a.getRotation() + ");\n";
        }
        
        return saveString;
    }

    public static void saveWorld(String methodName)
    {
        MethodImplementor.createMethod("Planet.java", "public void " + methodName + "()", saveWorld());
    }
}
