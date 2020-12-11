import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class arrowLeft here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class arrowLeft extends wardrobe_objects
{
    /**
     * Act - do whatever the arrowLeft wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public arrowLeft(int hoehe, int breite) {
        setImage("/mainChar/clothMenuTexts/arrowLeft.png");
        GreenfootImage arLeft = getImage();
        arLeft.scale(hoehe, breite);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            //voheriges Design-Bild
        }
        if(Greenfoot.isKeyDown("escape")){
            World wd = new wardrobe(/*ppX beim klicken, ppY beim klicken*/);
            Greenfoot.setWorld(wd);
        }
    }    
}
