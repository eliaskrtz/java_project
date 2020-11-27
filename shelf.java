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
    
    public shelf() {
       setImage("schrankWD.jpg");
       setRotation(0);
       GreenfootImage image = getImage();  
       image.scale(60, 100);
       setImage(image);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
