import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class arrowRight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
<<<<<<< HEAD:arrowRight.java
public class arrowRight extends wardrobe_object
=======
public class WDarrowRight extends wardrobe_objects
>>>>>>> 2188ebef968d5e4248a378632a80ec10955275b2:WDarrowRight.java
{
    /**
     * Act - do whatever the arrowRight wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
<<<<<<< HEAD:arrowRight.java
    public int c = 0;
    public arrowRight(int hoehe, int breite) {
=======
    
    public WDarrowRight(int hoehe, int breite) {
>>>>>>> 2188ebef968d5e4248a378632a80ec10955275b2:WDarrowRight.java
        setImage("/mainChar/clothMenuTexts/arrowRight.png");
        GreenfootImage arRight = getImage();
        arRight.scale(hoehe, breite);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            if (c != 3) {
                c++;
            } else c = 0;
            getWorld().removeObjects(getWorld().getObjects(mainChar.class));
            getWorld().addObject(new mainChar("big", c), 720/2, 720/2);
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
