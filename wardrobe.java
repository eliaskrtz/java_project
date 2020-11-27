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
        //Aussenwände
        addObject(new mainChar(), 1280/2, 720/2);
        addObject(new wallV(60, 720), 748, 363);
        addObject(new wallV(60, 720), 29, 720/2);
        addObject(new wallH(720, 60), 382 , 690);
        addObject(new wallH(720, 60), 418 , 30);
        //Door lobby
        addObject(new lobby_door(60, 720/3), 30, 350);
        //---Initialisierung der Objekte in wardobe---
        //addObject(new shelf(), x, y);
    }
    
    
}
