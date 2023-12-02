package Bot;

import Models.Board;
import Models.Cell_Status;
import Models.Moves;

public class EasyBotStrategy implements BotStrategy {
    public Moves makeMove(Board board){
        for (int i = 0; i <board.getBoard().size() ; i++) {
            for (int j = 0; j < board.getBoard().size(); j++) {
                if(board.getBoard().get(i).get(j).getCell_Status().equals(Cell_Status.EMPTY)){
                    return new Moves(board.getBoard().get(i).get(j));
                }
            }
        }
        return null;
    }
}
