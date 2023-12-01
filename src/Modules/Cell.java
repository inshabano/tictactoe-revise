package Modules;

public class Cell {
    private int row;
    private int column;
    private Cell_Status Cell_Status;
    private Player player;
    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
        Cell_Status = Cell_Status.EMPTY;

    }

    public Cell(int row, int column, Cell_Status cell_Status, Player player) {
        this.row = row;
        this.column = column;
        Cell_Status = cell_Status;
        this.player = player;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
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
