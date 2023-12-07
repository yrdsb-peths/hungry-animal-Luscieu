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
    
    int score = 0;
    int level = 1;
    int movementSpeed = 4;
    Label scoreLabel;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        Elephant noko = new Elephant();
        addObject(noko, 300, 300);
        
        scoreLabel = new Label(0, 70);
        addObject(scoreLabel, 30, 30);
        
        spawnPizza();
        
        
    }
    
    public void gameOver() {
        Label gameOverLabel = new Label("Game Over", 90);
        addObject(gameOverLabel, getWidth()/2, getHeight()/2);
    }
    
    public void scoreIncrease()
    {
        score++;
        scoreLabel.setValue(score);
        if(score % 3 == 0)
        {
            level++;
        }
        if(score % 5 == 0)
        {
            movementSpeed++;
        }
    }
        
    public void spawnPizza()
    {
        Pizza cheese = new Pizza();
        cheese.setSpeed(level);
        int random = Greenfoot.getRandomNumber(600);
        addObject(cheese,random, 1);
    }           
    
    public int getMovementSpeed()
    {
        return movementSpeed;
    }
}
