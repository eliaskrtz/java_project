import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wallWard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wallWardH extends wardrobe_objects
{
    /**
     * Act - do whatever the wallWard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       setImage("blackBG.jpg");
        setRotation(0);
       GreenfootImage image = getImage();  
        image.scale(300, 30);
        setImage(image);
    }    
}
