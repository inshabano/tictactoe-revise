package Strategies;

import Models.Board;
import Models.Moves;

public interface WinningStrategy {
    boolean checkWinner(Board board, Moves move);
}
