package PlanetenSzenario;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Math;

/**
 * Write a description of class Tank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tank extends Actor
{
    private int range;

    public Tank(int range)
    {
        this.range = range;
    }

    public Tank(){ this(1); }

    /**
     * Act - do whatever the Tank wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    

    protected void addedToWorld(World world)
    {
        GreenfootImage img = getImage();
        img.scale(50, 50);
        setImage(img);
    }

    public void shoot()
    {
        int rot = getRotation();
        int xDir = xDirFromRot(rot);
        int yDir = yDirFromRot(rot);
        int xSign = getSign(xDir);
        int ySign = getSign(yDir);

        World w = getWorld();

        for (int i = 0; i < range; i++)
        {
            System.out.println((xDir + xSign * i) + ", " + (yDir + ySign * i));
            Actor a = getOneObjectAtOffset(xDir + xSign * i, yDir + ySign * i, Huegel.class);
            if (a != null)
            {
                System.out.println(a);
                w.removeObject(a);
            }
        }
    }

    public int xDirFromRot(double rot)
    {
        rot = Math.toRadians(rot);
        System.out.println(Math.cos(rot) - Math.sin(rot));
        return (int)Math.round(Math.cos(rot) - Math.sin(rot));
    }

    public int yDirFromRot(double rot)
    {
        rot = Math.toRadians(rot);
        System.out.println(Math.sin(rot) - Math.cos(rot));
        return (int)Math.round(Math.sin(rot) - Math.cos(rot));
    }

    public int getSign(int test)
    {
        if(test > 0)
            return 1;
        else if(test < 0)
            return -1;
        else
            return 0;
    }
}
