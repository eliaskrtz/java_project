import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv1_triangle_chair here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv1_triangle_chair extends lv1_objects
{
    /**
     * Act - do whatever the lv1_triangle_chair wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    } 
    public lv1_triangle_chair (int laenge, int breite){
     setImage("triangle.png"); 
      setRotation(0);
       GreenfootImage image = getImage();  
       image.scale(laenge, breite);
       setImage(image); 
    }
}