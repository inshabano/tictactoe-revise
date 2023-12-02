package Bot;

import Models.Board;
import Models.Moves;

public interface BotStrategy {
    public default Moves makeMove(Board board) {
        return null;
    }
}

