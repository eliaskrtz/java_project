import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv1_darkness here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv1_darkness extends lv1_objects
{
    /**
     * Act - do whatever the lv1_darkness wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     aussehen();
     java.util.List actors = getWorld().getObjects(mainChar.class);
     mainChar actor = (mainChar)actors.get(0);   
     if(Greenfoot.isKeyDown("a")){
            int x = actor.getX();
            int y = actor.getY();
            setLocation(x - 2, y - 200);
            }
     if(Greenfoot.isKeyDown("d")){ 
            int x = actor.getX();
            int y = actor.getY();
            setLocation(x + 2, y - 200);
            }
     if(Greenfoot.isKeyDown("w")){ 
            int x = actor.getX();
            int y = actor.getY();
            setLocation(x, y - 2 - 200);
            }
     if(Greenfoot.isKeyDown("s")){ 
            int x = actor.getX();
            int y = actor.getY();
            setLocation(x, y + 2 - 200);
            }
    }
    
    public void aussehen(){
      setImage("blackBG.jpg");
    }
<<<<<<< HEAD
=======
    public void movements(){
      if( Greenfoot.isKeyDown("w")){
            int y = getY();
            int x = getX();
            
                setLocation(x, y );
            
        }
      if( Greenfoot.isKeyDown("a")){
            int y = getY();
            int x = getX();
            
                setLocation(x , y);
        
        }
      if( Greenfoot.isKeyDown("s")){
            int y = getY();
            int x = getX();
           
                setLocation(x, y );
         
        } 
      if( Greenfoot.isKeyDown("d")){
            //int y = player_pos.ppY;
            //int x = player_pos.ppX;
          
                //setLocation(x , y);
            
        }  
    }
>>>>>>> f05a1aad37721535bc455442dbe926edb1606147
}

