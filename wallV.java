import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wallV extends walls
{
    /**
     * Act - do whatever the wall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public wallV() {
       setImage("blackBG.jpg");
       setRotation(90);
       GreenfootImage image = getImage();  
       image.scale(600, 60);
       setImage(image);
    }
    
    public wallV(int laenge, int breite) {
       setImage("blackBG.jpg");
       setRotation(0);
       GreenfootImage image = getImage();  
       image.scale(laenge, breite);
       setImage(image);
    }
    
    public void act() 
    {
       
    }    
}
