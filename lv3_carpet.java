import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv3_carpet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv3_carpet extends lv3_objects
{
    /**
     * Act - do whatever the lv3_carpet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public lv3_carpet() {
       setImage("red.png");
       setRotation(0);
       GreenfootImage image = getImage();  
       image.scale(700, 230);
       setImage(image);
    }
    
    
    public void act() 
    {
        
    }
    
    
}
