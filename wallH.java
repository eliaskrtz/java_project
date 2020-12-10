 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wallH here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wallH extends walls
{
    /**
     * Act - do whatever the wallH wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public wallH() {
       setImage("blackBG.jpg");
       setRotation(0);
       GreenfootImage image = getImage();  
       image.scale(1280, 60);
       setImage(image);
    }
    
    public wallH(int laenge, int breite) {
       setImage("blackBG.jpg");
       setRotation(90);
       GreenfootImage image = getImage();  
       image.scale(laenge, breite);
       setImage(image);
    }
    
    public void act() 
    {
       
    }    
}
