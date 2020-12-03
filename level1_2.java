
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level1_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level1_2 extends level1
{

    /**
     * Constructor for objects of class level1_2.
     * 
     */
    public level1_2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        addObject(new mainChar(), 1122, 617);
        addObject(new wallV(), 1250, 720/2);
        addObject(new wallV(), 29, 720/2);
        addObject(new wallH(), 1280 / 2 , 690);
        addObject(new wallH(), 1280 / 2 , 30);
        addObject(new lv1_knight(60, 60), 1180, 523);
        //addObject(new wallH(10, 100), 1005, 610);
        addObject(new wallV(10, 100), 1005, 610);
        addObject(new wallV(10, 300), 1005, 310);
        addObject(new wallH(10, 600), 699, 565);
        addObject(new wallH(10, 285), 857, 455);
        addObject(new wallH(10, 215), 507, 455);
        addObject(new wallV(10, 100), 405, 510);
        addObject(new wallV(10, 200), 720, 350);
        addObject(new wallV(10, 200), 610, 350);
    
    }
    
}
