package Models;

public class Player {
    private String Id;
    private String Name;
    private Character Symbol;
    private Player_Type player_type;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Character getSymbol() {
        return Symbol;
    }

    public void setSymbol(Character symbol) {
        Symbol = symbol;
    }

    public Player_Type getPlayer_type() {
        return player_type;
    }

    public void setPlayer_type(Player_Type player_type) {
        this.player_type = player_type;
    }
    // TODO :method to make move

    public Player(String id, String name, Character symbol, Player_Type player_type) {
        Id = id;
        Name = name;
        Symbol = symbol;
        this.player_type = player_type;
    }
}
