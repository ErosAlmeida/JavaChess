package boardgame;

public abstract class Piece {
    protected Position position;
    private Board board;

    protected Board getBoard() {
        return board;
    }

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    public abstract boolean[][] possibleMoves();

    public boolean possibleMoves(Position position){
        return possibleMoves()[position.getColumn()][position.getRow()];
    }
    public boolean isThereAnyPossibleMove(){
        boolean[][] mat = possibleMoves();
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j< mat[i].length; j++){
                if (mat[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public abstract void remove(Piece capturedPiece);
}
