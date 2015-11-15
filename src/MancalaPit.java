/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UditSharma
 */
public class MancalaPit implements Pit{

    private Player player;
    private int pieces;
    private String id;
    
    public MancalaPit ()
    {
        
    }
    
    public MancalaPit (Player p)
    {
        player = p;
        pieces = 0;
        id = "Mancala" + player.getName();
    }
    
    @Override
    public void addPieces() {
        
    }

    public void removePiece() {
        
    }

    @Override
    public Player getPlayer() {
        return player;
    }

    @Override
    public String getPitID() {
        return id;
    }
    
}
