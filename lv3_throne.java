import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv3_throne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv3_throne extends lv3_objects
{
    /**
     * Act - do whatever the lv3_throne wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public lv3_throne() {
       setImage("throne.jpg");
       setRotation(0);
       GreenfootImage image = getImage();  
       image.scale(70, 70);
       setImage(image);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
