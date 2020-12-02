import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level1_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level1_1 extends level1
{

    /**
     * Constructor for objects of class level1_1.
     * 
     */
    public level1_1()
    {
       addObject(new mainChar(), 1190, 356);
       addObject(new door_fake(60, 100), 1251, 720 / 2);
       addObject(new lv1_table(500, 200), 1280 / 2,720 / 2);
       addObject(new lv1_knight(60, 60), 264, 97); 
       addObject(new lv1_crown_chair(100, 100), 187, 237);
       addObject(new lv1_triangle_chair(100, 100), 761, 123);
       addObject(new lv1_rectangle_chair(100, 100), 209, 499);
       addObject(new lv1_pentagon_chair(100, 100), 828, 580);
       addObject(new lv1_hexagon_chair(100, 100), 1016, 352);
       addObject(new lv1_heptagon_chair(100, 100), 493, 567);
    }
}
