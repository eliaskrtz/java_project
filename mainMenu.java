import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * this class creates the Main Menu in the Startscreen
 * triggers when pressing ESC in level choose room
 *  
 * 
 */
public class mainMenu extends World
{

    /**
     * Constructor for objects of class mainMenu.
     * 
     */
    public mainMenu()
    {  
        super(1280, 720, 1);
        addObject(new startButton(), 1280/2, 720/2 - 10);
        addObject(new optionsButton(), 1280/2, 720/2 + 180);
      
    }    
}
