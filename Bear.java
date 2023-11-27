import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bear extends Actor
{
    /**
     * Act - do whatever the Bear wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("w"))
        {
            turn(-90);
            move(10); 
            turn(90);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            move(-10);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            turn(90);
            move(10);
            turn(-90);
        }
        if(Greenfoot.isKeyDown("d"))
        {
            move(10);
        }
        
        if(isTouching(Pizza.class))
        {
            removeTouching(Pizza.class);
            MyWorld world = (MyWorld) getWorld();
            world.spawnPizza();
        }
    }
}
