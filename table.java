import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class table here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class table extends wardrobe_objects
{
    /**
     * Act - do whatever the table wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public table(int laenge, int breite) {
       setImage("schrankWD.jpg");
       setRotation(0);
       GreenfootImage image = getImage();  
       image.scale(laenge, breite);
       setImage(image);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
