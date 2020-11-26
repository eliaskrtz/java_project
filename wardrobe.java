import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * mainChar can change his clothes here
 * 
 *  
 * 
 */
public class wardrobe extends World
{

    /**
     * Constructor for objects of class wardrobe.
     * 
     */
    public wardrobe()
    {    
        super(1280, 720, 1); 
        setBackground(new GreenfootImage("grassBGlevelRoom.jpg"));
        addObject(new mainChar(), 1280/2, 720/2);
        //---Initialisierung der Objekte in wardobe---
        //addObject(new Schrank..)
    }
    
    
}
