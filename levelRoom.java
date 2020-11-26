import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * this is the Room where you can choose the Level
 * and go to the wardrobe
 * 
 * 
 */
public class levelRoom extends World
{

    /**
     * Constructor for objects of class levelRoom.
     * 
     */
    public levelRoom()
    {   
        super(1280, 720, 1); 
        setBackground(new GreenfootImage("grassBGlevelRoom.jpg"));
        addObject(new mainChar(), 1280/2, 720/2);
        addObject(new wallV(), 1250, 720/2);
        addObject(new wallV(), 29, 720/2);
        addObject(new wallH(), 1280 / 2 , 690);
        addObject(new wallH(), 1280 / 2 , 30);
        addObject(new wallWardH(), 1280 / 2 + 482 , 720 / 2 + 70);
        addObject(new wallWardV(), 158, 720 / 2 + 150);
    }
}
