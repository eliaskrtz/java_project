import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class painting_4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class painting_4 extends lv3_paintings
{
    /**
     * Act - do whatever the painting_4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public painting_4() {
       setImage("yellow.png");
       setRotation(0);
       GreenfootImage image = getImage();  
       image.scale(111, 10);
       setImage(image);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
