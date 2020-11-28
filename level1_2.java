
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level1_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level1_2 extends World
{

    /**
     * Constructor for objects of class level1_2.
     * 
     */
    public level1_2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1);
        addObject(new mainChar(), 1122, 617);
        addObject(new wallV(), 1250, 720/2);
        addObject(new wallV(), 29, 720/2);
        addObject(new wallH(), 1280 / 2 , 690);
        addObject(new wallH(), 1280 / 2 , 30);
        addObject(new wallV(), 1250, 720/2);
        addObject(new lv1_knight(60, 60), 1180, 523);
        addObject(new wallV(10, 100), 1011, 610);
        addObject(new wallV(700, 10), 658, 565);
        addObject(new wallH(10, 100), 313 , 510);
        addObject(new wallH(10, 200), 1003 , 360);
        addObject(new wallH(10, 100), 703 , 410);
        addObject(new wallV(300, 10), 848, 455);
        addObject(new wallV(300, 10), 458, 456);
        addObject(new wallV(100, 10), 848, 365);
        addObject(new wallV(10, 100), 893, 310);
        addObject(new wallV(10, 100), 1003, 210);
        addObject(new wallH(10, 200), 1003 , 210);
        
        
        
        
        
    }
    
}
