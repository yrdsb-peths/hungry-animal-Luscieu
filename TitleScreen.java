import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * TitleScreen.
 * 
 * @author Brennan 
 * @version December 2023
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Speedy Elephant", 70);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(titleLabel, getWidth()/2, getHeight()/2 - getHeight()/4);
        tutorial();
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Creates labels with the intent to let the user learn the controls
     */
    public void tutorial()
    {
        Label controls = new Label("Use WASD to move", 30);
        addObject(controls, getWidth()/2-180, getHeight() - 90);
        Label important = new Label("Hit 'shift' to dash", 30);
        addObject(important, getWidth()/2-180, getHeight()-55);
        Label start = new Label("Hit spacebar to start", 30);
        addObject(start, getWidth()/2-180, getHeight()-20);
    }
}
