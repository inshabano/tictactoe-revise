package Models;

import Strategies.WinningStrategy;

import java.util.List;

public class Game {
    private List<Player> playerList;
    private Board board;
    private List<Moves> moves;
    private Player next_player;
    private Game_Progress gameProgress;
    private Player Winner;
    private List<WinningStrategy> WinningStrategy;
    public void makemove(){}

    public Game(List<Player> playerList, Board board,
                List<Moves> moves, Player next_player,
                Game_Progress gameProgress, Player winner,
                List<WinningStrategy> winningStrategy) {
        this.playerList = playerList;
        this.board = board;
        this.moves = moves;
        this.next_player = next_player;
        this.gameProgress = gameProgress;
        Winner = winner;
        WinningStrategy = winningStrategy;
    }
    // TODO add builder design pattern
}
