/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UditSharma
 */
public class PlayerPit implements Pit{
    
    private Player player;
    private int pieces;
    private String id;

    public PlayerPit(Player p, int numberOfPieces, int id) {
        player = p;
        pieces = numberOfPieces;
        this.id = player.getName() + id;
    }
    
    public void addPieces()
    {
        pieces++;
    }
    
    public void empty()
    {
        pieces = 0;
    }
    
    public int getPieces()
    {
        return pieces;
    }
    
    public Player getPlayer()
    {
        return player;
    }
    
    public String getPitID()
    {
        return id;
    }
    
}
