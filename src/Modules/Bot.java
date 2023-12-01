package Modules;

import Strategies.BotStrategy;

public class Bot extends Player {
    private LevelOf_Difficulty Difficulty_level;
    private BotStrategy botStrategy;

    public Bot(String id, String name, Character symbol, Player_Type player_type,
               LevelOf_Difficulty difficulty_level,
               BotStrategy botStrategy) {
        super(id, name, symbol, player_type);
        this.Difficulty_level = difficulty_level;
        this.botStrategy = botStrategy;
    }

    // TODO : Override makeMove()


}
