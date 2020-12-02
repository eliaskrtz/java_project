import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv1_Hint here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv1_Hint extends level1
{

    /**
     * Constructor for objects of class lv1_Hint.
     * 
     */
    public lv1_Hint()
    {
        addObject(new lv1_knight(500, 500), 313 , 720/2 );
        setHint();
    }
    public Actor message = null;
    public static final Color BLACK = schwarz;
    public void setHint()
    {
    GreenfootImage image = null;
    String text = "hint";
    
    image = new GreenfootImage(text, 28,schwarz,1280 / 2, 150);
    message.setImage(image);
    }
 
}
