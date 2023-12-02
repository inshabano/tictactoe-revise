package Strategies;

import Models.Board;
import Models.Moves;
import Models.Player;


import java.util.HashMap;
import java.util.Map;

public class RowWinning implements WinningStrategy {

    private Map<Integer,Map<Player,Integer>> map = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Moves move) {
        int row = move.getCell().getRow();
        Player player = move.getPlayer();
        if(!map.containsKey(row)){
            map.put(row,new HashMap<>());
        }
        Map<Player,Integer> rowMap = map.get(row);
        if(!rowMap.containsKey(player)){
            rowMap.put(player,0);
        }
        rowMap.put(player, rowMap.get(player)+1);
        if(rowMap.get(player) == board.getSize() ){
            return true;
        }
        return false;
    }
}


