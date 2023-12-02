package Models;

public class Cell {
    private int row;

    private int col;
    private Cell_Status Cell_Status;
    private Player player;
    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        Cell_Status = Cell_Status.EMPTY;

    }

    public Cell(int row, int col, Cell_Status cell_Status, Player player) {
        this.row = row;
        this.col = col;
        Cell_Status = cell_Status;
        this.player = player;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int column) {
        this.col = col;
    }

    public Cell_Status getCell_Status() {
        return Cell_Status;
    }

    public void setCell_Status(Cell_Status cell_Status) {
        Cell_Status = cell_Status;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
