package Modules;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int size;
    private List<List<Cell>> board;

    public Board(int size){
        this.size = size;
        this.board = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            board.add(new ArrayList<>());
            for(int j = 0; j < size; j++) {
                board.get(i).add(new Cell(i, j));
            }
        }

    }
    public void displayBoard(){
        for (int i = 0; i < board.size(); i++) {
            for (int j = 0; j < board.size(); j++) {
                if(board.get(i).get(j).getCell_Status().equals(Cell_Status.EMPTY)){
                    System.out.print("|  |");
                }
                else{
                    System.out.print("| " + board.get(i).get(j).getPlayer() + " |");
                }

            }
            System.out.println();
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }
}
