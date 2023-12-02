package Bot;

import Models.LevelOf_Difficulty;

public class BotPlaying_Factory {
    public static BotStrategy getBotStrategy(LevelOf_Difficulty difficulty){
        switch (difficulty){
            case EASY:
                return new EasyBotStrategy();
            case MEDIUM:
                return new MediumBotStrategy();
            case HARD:
                return new HardBotStrategy();
        }
        return null;
    }
}
