package PlanetenSzenario;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gestein here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gestein extends Actor
{
    private String farbe;
    private int wassergehalt;
    
    
    public Gestein()
   {
       wassergehalt = Greenfoot.getRandomNumber(20);
       
               if (Greenfoot.getRandomNumber(2)==0)
        {
            farbe = "rot";
            setImage("images/gesteinRot.png");
        }
        else
        {
            farbe = "blau";
            setImage("images/gesteinBlau.png");
        }
    }
    
    /**
     * Act - do whatever the Gestein wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

    } 
    
    public int getWassergehalt()
    {
        return wassergehalt;
    }
    
}
