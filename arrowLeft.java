import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class arrowLeft here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class arrowLeft extends wardrobe_object
{
    /**
     * Act - do whatever the arrowLeft wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int c = 0;
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
            if(Greenfoot.mouseClicked(this)){
            if (c != 0) {
                c--;
            } else c = 3;
            getWorld().removeObjects(getWorld().getObjects(mainChar.class));
            getWorld().addObject(new mainChar("big", c), 720/2, 720/2);
        }
        }
        if(Greenfoot.isKeyDown("escape")){
            World wd = new wardrobe(/*ppX beim klicken, ppY beim klicken*/);
            Greenfoot.setWorld(wd);
        }
    }
    
    public int setOutfit() {
        int a = c;
        return a;
    }   
}
