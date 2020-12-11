import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class arrowRight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class arrowRight extends wardrobe_objects
{
    /**
     * Act - do whatever the arrowRight wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public arrowRight(int hoehe, int breite) {
        setImage("/mainChar/clothMenuTexts/arrowRight.png");
        GreenfootImage arRight = getImage();
        arRight.scale(hoehe, breite);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            //nächstes Design-Bild
        }
        if(Greenfoot.isKeyDown("escape")){
            World wd = new wardrobe(/*ppX beim klicken, ppY beim klicken*/);
            Greenfoot.setWorld(wd);
        }
    }    
}
