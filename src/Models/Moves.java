package Models;

public class Moves {
    private Cell cell;
    private Player player;
    private Player_Type playerType;
    public Cell_Status cellStatus;

    public Moves(Cell cell, Player player) {
        this.cell = cell;
        this.player = player;
        this.cellStatus =Cell_Status.OCCUPIED;
    }
    public Moves(Cell cell) {
        this.cell = cell;
        this.playerType = Player_Type.BOT;
        this.cellStatus =Cell_Status.OCCUPIED;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
