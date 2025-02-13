package boardgame;

public class Piace {
    protected Position position;
    private Board board;

    protected Board getBoard() {
        return board;
    }

    public Piace(Board board) {
        this.board = board;
        position = null;
    }
}
