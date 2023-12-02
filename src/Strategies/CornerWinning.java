package Strategies;

import Models.*;

public class CornerWinning implements WinningStrategy{
    public boolean checkWinner(Board board, Moves move){
        Player currPlayer = move.getCell().getPlayer();
        int boardSize = board.getBoard().size();
        int[] row = {0 , 0 , boardSize -1, boardSize-1};
        int[] col = {0, boardSize -1, 0, boardSize-1};
        for (int i = 0; i < 4; i++) {
            Cell currCell = board.getBoard().get(row[i]).get(col[i]);
            if(currCell.getCell_Status().equals(Cell_Status.EMPTY)
                    ||!currCell.getPlayer().equals(currPlayer)){
                return false;
            }
        }
        return true;
    }
}
