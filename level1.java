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
        addObject(new mainChar(), 1190, 356);
        addObject(new wallV(), 1250, 720/2);
        addObject(new wallV(), 29, 720/2);
        addObject(new wallH(), 1280 / 2 , 690);
        addObject(new wallH(), 1280 / 2 , 30);
        addObject(new wallV(), 1250, 720/2);
       addObject(new door_fake(60, 100), 1251, 720 / 2);
       addObject(new lv1_table(500, 200), 1280 / 2,720 / 2);
       addObject(new lv1_knight(60, 60), 264, 97); 
       addObject(new lv1_crown_chair(100, 100), 187, 237);
       addObject(new lv1_triangle_chair(100, 100), 761, 123);
       addObject(new lv1_rectangle_chair(100, 100), 209, 499);
    }
}
