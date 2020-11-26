import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class optionsMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class optionsMenu extends World
{

    /**
     * Constructor for objects of class optionsMenu.
     * 
     */
    public optionsMenu()
    {    
       super(1280, 720, 1);
      addObject(new backButton(), 1280/2 - 500, 720/2 + 270);
    }
}
