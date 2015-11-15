
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UditSharma
 */
public class Board {
    
    private ArrayList<Pit> pit1;
    private ArrayList<Pit> pit2;
    private ArrayList<Pit> board;
    private Player p1;
    private Player p2;
    
    public Board (int start)
    {
        p1 = new Player ("player1");
        p2 = new Player ("Player2");
        pit1 = createPlayerPits(p1, start);
        pit2 = createPlayerPits(p2, start);
        createBoard(pit1,pit2);
    }
    
    private void createBoard(ArrayList<Pit>a, ArrayList<Pit>b)
    {
        int first = 0,last = 0;
        board = new ArrayList<>();
        
        for(int i = 0; i < a.size(); i++)
        {
            if(a.get(i).getClass() == ((new MancalaPit()).getClass()))
            {
                first = i;
            }
        }
        for(int j = 0; j < a.size(); j++)
        {
            if(b.get(j).getClass() == ((new MancalaPit()).getClass()))
            {
                last = j;
            }
        }
        
        for (int k = 0; k < a.size(); k++)
        {
            if(k != first)
            {
                board.add(a.get(k));
            }
        }
        board.add(a.get(first));
        for (int l = b.size()-1; l > -1; l--)
        {
            if(l != last)
            {
                board.add(b.get(l));
            }
        }   
        board.add(b.get(last));
    }
    
    private ArrayList<Pit> createPlayerPits(Player p, int k)
    { 
        ArrayList<Pit> result = new ArrayList<>();
        MancalaPit m = new MancalaPit(p);
        for(int i = 0; i < 6; i++)
        {
            result.add(new PlayerPit(p, k, i+1));
        }
        result.add(m);
        return result;
    }
    
    
    public void printBoard () //becomes draw method
    {
        for (int i = 0; i< board.size(); i++)
        {
            System.out.println(board.get(i).getPitID());
        }
    }
    
    public void movePieces()
    {
        
    }
    
    public void updatePits ()
    {
        
    }
}
