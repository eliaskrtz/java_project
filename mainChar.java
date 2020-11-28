import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Main Character with all 
 * 
 *  
 * 
 */
public class mainChar extends Actor
{
    /**
     * Act - do whatever the mainChar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {
        movements();
        ward_door();
        door_lv1();
        door_lv2();
        door_lv3();
        door_lv4();
   }    
    public void movements() {
    if(Greenfoot.isKeyDown("a")){
     int rot = getRotation();
     int x = getX();
     int y = getY();
     if (getOneObjectAtOffset(-30, 0, walls.class) == null) {
        if( rot == 0 ){
            setRotation(180);
            getImage().mirrorVertically();
        }
        else{
     setLocation(x - 2, y);
    }
    }
    }
    if( Greenfoot.isKeyDown("w")){
        int y = getY();
        int x = getX();
         if (getOneObjectAtOffset(0, - 35, walls.class) == null) {
        setLocation(x, y - 2);
         
        }
    }
    if( Greenfoot.isKeyDown("s")){
       int y = getY();
       int x = getX();
    if (getOneObjectAtOffset(0, 35, walls.class) == null) {
       setLocation(x, y + 2);
     
        }
       }
    if(Greenfoot.isKeyDown("d")){
        int rot = getRotation();
        int x = getX();
        int y = getY();
     if (getOneObjectAtOffset(30, 0, walls.class) == null) {    
        if( rot == 180 ){
            setRotation(0);
            getImage().mirrorVertically();
        }
        else{
     setLocation(x + 2, y);
    }
    }
    }
    if(Greenfoot.isKeyDown("escape")){
     World Menu = new mainMenu();
     Greenfoot.setWorld(Menu);
    }
    
   }
    public void clothes() {
        int hat = 0;
        int shirt = 0;
        int pants = 0;
        /*if (chClothes) {            //clothing changes in wardrobe
            hat = perHat;
            shirt = perShirt;
            pants = perPants;
        }*/
   }
   public void ward_door(){
      List<wardrobe_door>objects = getObjectsInRange(100, wardrobe_door.class); 
      if( objects.isEmpty()){
          
    } 
    else{
     if(Greenfoot.isKeyDown("e")){
         World ward = new wardrobe();
        Greenfoot.setWorld(ward);
        }
    }  
    }public void door_lv1(){
      List<door_lv1>objects = getObjectsInRange(100, door_lv1.class); 
      if( objects.isEmpty()){
          
    } 
    else{
     if(Greenfoot.isKeyDown("e")){
         World lv1 = new level1();
        Greenfoot.setWorld(lv1);
        }
    }  
    }
    public void door_lv2(){
      List<door_lv2>objects = getObjectsInRange(100, door_lv2.class); 
      if( objects.isEmpty()){
          
    } 
    else{
     if(Greenfoot.isKeyDown("e")){
         World lv2 = new level2();
        Greenfoot.setWorld(lv2);
        }
    }
    }
    public void door_lv3(){
      List<door_lv3>objects = getObjectsInRange(100, door_lv3.class); 
      if( objects.isEmpty()){
          
    } 
    else{
     if(Greenfoot.isKeyDown("e")){
         World lv3 = new level3();
        Greenfoot.setWorld(lv3);
        }
    }  
    }
    public void door_lv4(){
      List<door_lv4>objects = getObjectsInRange(100, door_lv4.class); 
      if( objects.isEmpty()){
          
    } 
    else{
     if(Greenfoot.isKeyDown("e")){
         World lv4 = new level4();
        Greenfoot.setWorld(lv4);
        }
    }  
    }
}

    

