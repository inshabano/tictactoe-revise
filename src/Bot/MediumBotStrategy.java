package Bot;

import Bot.BotStrategy;
import Models.Board;
import Models.Cell_Status;
import Models.Moves;

import java.util.Random;

public class MediumBotStrategy implements BotStrategy {
    public Moves makeMove(Board board) {
        int i, j;

        do {
            Random random = new Random();
            i = random.nextInt(board.getBoard().size());
            j = random.nextInt(board.getBoard().size());
        }
        while (board.getBoard().get(i).get(j).getCell_Status().equals(Cell_Status.EMPTY));

        return new Moves(board.getBoard().get(i).get(j));
    }

}
