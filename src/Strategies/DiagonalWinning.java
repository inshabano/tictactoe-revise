package Strategies;

import Models.Board;
import Models.Moves;
import Models.Player;

import java.util.HashMap;
import java.util.Map;

public class DiagonalWinning implements WinningStrategy{
    private Map<Player,Integer> rightdiag = new HashMap<>();
    private Map<Player,Integer> leftdiag = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Moves move) {
        int col = move.getCell().getCol();
        int row = move.getCell().getRow();
        Player player = move.getPlayer();
        if(row == col) {
            if (!leftdiag.containsKey(player)) {
                leftdiag.put(player, 0);
            }
            leftdiag.put(player, leftdiag.get(player) + 1);
            if (leftdiag.get(player) == board.getSize()) {
                return true;
            }
        }
        if(row == (board.getSize()-row-1)){
            if(!rightdiag.containsKey(player)){
                rightdiag.put(player,0);
            }
            rightdiag.put(player,rightdiag.get(player)+1);
            if(rightdiag.get(player) == board.getSize()){
                return true;
            }
        }
        return false;
    }
}
