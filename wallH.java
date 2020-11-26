import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wallH here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wallH extends levelRoom_objects
{
    /**
     * Act - do whatever the wallH wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         setImage("blackBG.jpg");
        setRotation(0);
       GreenfootImage image = getImage();  
        image.scale(1280, 60);
        setImage(image);
    }    
}
