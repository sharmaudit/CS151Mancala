/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UditSharma
 */
public class Player {
    
    private String name;
    private int undoCount;
    
    public Player (String name)
    {
        undoCount = 3;
        this.name = name;
        
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getUndoCount()
    {
        return undoCount;
    }
    
}
