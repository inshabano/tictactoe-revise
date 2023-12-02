package Strategies;

import Models.Board;
import Models.Moves;
import Models.Player;

import java.util.HashMap;
import java.util.Map;

public class ColumnWinning implements WinningStrategy{
    private HashMap<Integer, Map<Player, Integer>> map = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Moves move) {

        int i = move.getCell().getRow();
        int j = move.getCell().getCol();
        Player player = move.getPlayer();
        if (!map.containsKey(j)) {
            map.put(j, new HashMap<>());
        }
        Map<Player, Integer> colMap = map.get(j);
        if (!colMap.containsKey(player)) {
            colMap.put(player, 0);
        }
        colMap.put(player, colMap.get(player) + 1);
        if (colMap.get(player) == board.getSize()) {
            return true;
        }
        return false;
    }
}
