import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class text extends Actor
{
    /**
     * Act - do whatever the text wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public text(String text) {
        this.setImage("bild");
        this.getImage().drawString(text, 0, 0);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
