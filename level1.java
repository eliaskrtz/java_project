import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class levelOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level1 extends World
{

    /**
     * Constructor for objects of class levelOne.
     * 
     */
    public level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1);
        addObject(new mainChar(), 1280/2, 720/2);
        addObject(new wallV(), 1250, 720/2);
    }
}
