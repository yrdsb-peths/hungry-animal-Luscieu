import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, true); 
        
        Bear noko = new Bear();
        addObject(noko, 300, 300);
        
        spawnPizza();
        
        
    }
        
    public void spawnPizza()
    {
        Pizza cheese = new Pizza();
        int random = Greenfoot.getRandomNumber(600);
        addObject(cheese,random, 1);
    }           
}
