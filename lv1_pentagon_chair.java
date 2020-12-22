import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class lv1_pentagon_chair here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv1_pentagon_chair extends lv1_objects
{
    /**
     * Act - do whatever the lv1_pentagon_chair wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    } 
    public lv1_pentagon_chair (int laenge, int breite){
     setImage("pentagon.jpg"); 
      setRotation(0);
       GreenfootImage image = getImage();  
       image.scale(laenge, breite);
       setImage(image); 
    }
}
