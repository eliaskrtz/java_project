import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv1_crown_chair here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv1_crown_chair extends lv1_objects
{
    /**
     * Act - do whatever the lv1_crown_chair wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
    }   
    public lv1_crown_chair (int laenge, int breite){
     setImage("crown.jpg"); 
      setRotation(0);
       GreenfootImage image = getImage();  
       image.scale(laenge, breite);
       setImage(image); 
    }
}
