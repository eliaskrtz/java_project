import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv1_table here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv1_table extends lv1_objects
{
    /**
     * Act - do whatever the lv1_table wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     
    } 
    public lv1_table ( int laenge, int breite){
      setImage("schrankWD.jpg");
       setRotation(0);
       GreenfootImage image = getImage();  
       image.scale(laenge, breite);
       setImage(image);    
    }
}
