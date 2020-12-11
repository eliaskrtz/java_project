import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.awt.*; 
import java.awt.event.KeyEvent; 
import java.awt.image.BufferedImage; 
import javax.swing.JFrame;
import java.util.ArrayList;
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
    
    public String size = "";  //Variable für mainChar erstellung (klein/normal/groß)
    
    public mainChar() {
        setImage(new GreenfootImage("/mainChar/manNormal.jpg")); //createChar()
        size = "normal";
    }
    
    public mainChar(String art) {
        size = art;               //wichtig für mainChar Erstellung
        if (size == "normal") {
            setImage(new GreenfootImage("/mainChar/manNormal.jpg")); //createChar()
        }
        if (size == "small") {
            setImage(new GreenfootImage("/mainChar/manSmall.jpg")); //createChar()
        }
        if (size == "big") {
            setImage(new GreenfootImage("/mainChar/manBig.jpg")); //createChar()
        }
    }
    
    public void act() 
    {
        //Abfrgae zur Größe des mainChars und deren movement
        if (size == "normal"){
            movements();
        }
        //Methoden fü den Türendurchlauf
        ward_door();
        lob_door();
        door_lv1();
        door_lv2();
        door_lv3();
        door_lv4();
        lv1_knight();
        lv1_room1_2_door();
        lv1_room2_1_door();
        lv1_room1_3_door();
        lv1_room3_1_door();
        tableWardrobe();  //geht noch nicht
    }    
    
    public void movements() {
        if(Greenfoot.isKeyDown("a")){
            int rot = getRotation();
            int x = getX();
            int y = getY();
            if (getOneObjectAtOffset(-30, 0, Actor.class) == null ) {
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
            if (getOneObjectAtOffset(0, - 35, Actor.class) == null  ) {
                setLocation(x, y - 2);
            }
        }
        if( Greenfoot.isKeyDown("s")){
            int y = getY();
            int x = getX();
            if (getOneObjectAtOffset(0, 35, Actor.class) == null ) {
               setLocation(x, y + 2);
            }
        }
        if(Greenfoot.isKeyDown("d")){
            int rot = getRotation();
            int x = getX();
            int y = getY();
            if (getOneObjectAtOffset(30, 0, Actor.class) == null ) {    
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
    
    public class player_pos{
        public int ppX = getX();
        public int ppY = getY();
    }
    public void clothes() {
        //die Dateien müssen unterschiedlich groß sein bullshit
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
    }
   
    public void door_lv1(){
        List<door_lv1>objects = getObjectsInRange(100, door_lv1.class); 
        if( objects.isEmpty()){
          
        } 
        else{
            if(Greenfoot.isKeyDown("e")){
                World lv1 = new level1_1();
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
    
    public void lob_door(){
        List<lobby_door>objects = getObjectsInRange(100, lobby_door.class);
        if( objects.isEmpty()){
          
        } 
        else{
            if(Greenfoot.isKeyDown("e")){
                World lob = new levelRoom(898, 540);
                Greenfoot.setWorld(lob);
            }
        }  
    }
    
    public void lv1_room1_2_door(){
        List<lv1_room1_2_door>objects = getObjectsInRange(100, lv1_room1_2_door.class); 
        if( objects.isEmpty()){
          
        } 
        else{
            if(Greenfoot.isKeyDown("e")){
                World lv1_2 = new level1_2();
                Greenfoot.setWorld(lv1_2);
            }
        }  
    }
    
    public void lv1_room2_1_door(){
        List<lv1_room2_1_door>objects = getObjectsInRange(100, lv1_room2_1_door.class); 
        if( objects.isEmpty()){
          
        } 
        else{
            if(Greenfoot.isKeyDown("e")){
                World lv1_1 = new level1_1();
                Greenfoot.setWorld(lv1_1);
            }
        }
     }
   
    public void lv1_room1_3_door(){
        List<lv1_room1_3_door>objects = getObjectsInRange(100, lv1_room1_3_door.class); 
        if( objects.isEmpty()){
          
        } 
        else{
            if(Greenfoot.isKeyDown("e")){
                World lv1_3 = new level1_3();
                Greenfoot.setWorld(lv1_3);
            }
        }  
    }
     
    public void lv1_room3_1_door(){
        List<lv1_room3_1_door>objects = getObjectsInRange(100, lv1_room3_1_door.class); 
        if( objects.isEmpty()){
          
        } 
        else{
            if(Greenfoot.isKeyDown("e")){
                World lv1_1 = new level1_1();
                Greenfoot.setWorld(lv1_1);
            }
        }  
    }
     
    public void lv1_knight(){
        List<lv1_knight>objects = getObjectsInRange(100, lv1_knight.class); 
        if( objects.isEmpty()){
        
        } 
        else{
        if(Greenfoot.isKeyDown("e")){
            World hint1 = new lv1_1_Hint();
            Greenfoot.setWorld(hint1);
        }
        }  
    }
    
    public void tableWardrobe() {
        List<table>objects = getObjectsInRange(100, table.class); 
        if( objects.isEmpty()){
        
        } 
        else{
        if(Greenfoot.isKeyDown("e")){
            World wdm = new clothMenu();
            Greenfoot.setWorld(wdm);
        }
        }
    }
}
    

