import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * interacting with this : extra menu to change characters clothes
 * 
 * 
 * 
 */
public class shelf extends wardrobe_objects
{
    /**
     * Act - do whatever the shelf wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public shelf(int laenge, int breite) {
       setImage("schrankWD.jpg");
       setRotation(0);
       GreenfootImage image = getImage();  
       image.scale(laenge, breite);
       setImage(image);
    }
    
    public void act() 
    {
        
    }
      
}
