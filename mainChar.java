import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
   }    
    public void movements() {
    if(Greenfoot.isKeyDown("a")){
     int rot = getRotation();
     int x = getX();
     int y = getY();
     if (getOneObjectAtOffset(-15, 0, walls.class) == null) {
        if( rot == 0 ){
            setRotation(180);
            getImage().mirrorVertically();
        }
        else{
     setLocation(x - 1, y);
    }
    }
    }
    if( Greenfoot.isKeyDown("w")){
        int y = getY();
        int x = getX();
         if (getOneObjectAtOffset(0, - 30, walls.class) == null) {
        setLocation(x, y - 1);
         
        }
    }
    if( Greenfoot.isKeyDown("s")){
       int y = getY();
       int x = getX();
    if (getOneObjectAtOffset(0, 30, walls.class) == null) {
       setLocation(x, y + 1);
     
        }
       }
    if(Greenfoot.isKeyDown("d")){
        int rot = getRotation();
        int x = getX();
        int y = getY();
     if (getOneObjectAtOffset(15, 0, walls.class) == null) {    
        if( rot == 180 ){
            setRotation(0);
            getImage().mirrorVertically();
        }
        else{
     setLocation(x + 1, y);
    }
    }
    if(Greenfoot.isKeyDown("escape")){
     World Menu = new mainMenu();
     Greenfoot.setWorld(Menu);
    }
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
}
