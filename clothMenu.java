import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class clothMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class clothMenu extends World
{

    /**
     * Constructor for objects of class clothMenu.
     * 
     */
    public clothMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(720, 720, 1);
        setBackground(new GreenfootImage("greyBG.jpg"));
        addObject(new backgroundImage("lightgrey", 180, 180), 150, 720/2);
        addObject(new mainChar("big"), 150, 720/2);
    }
}
