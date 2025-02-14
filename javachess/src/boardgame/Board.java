package boardgame;

public class Board {
    private int rows;
    private int columns;
    private Piece[][] pieces;  

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Board(int rows, int columns) {
        if (rows < 1 || columns < 1) {
            throw new BoardException("Error creating board! There must be at least one row and one column.");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns]; 
    }

    // Método correto para acessar uma peça no tabuleiro
    public Piece getPiece(int row, int column) {
        if (!positionExists(row, column)) {
            throw new BoardException("Position not on the board");
        }
        return pieces[row][column];
    }

    // Método correto para acessar uma peça usando uma posição
    public Piece getPiece(Position position) {
        if (!positionExists(position)) {
            throw new BoardException("Position not on the board");
        }
        return getPiece(position.getRow(), position.getColumn());
    }

    // Método para colocar uma peça no tabuleiro
    public void placePiece(Piece piece, Position position) {
        if (thereIsAPiece(position)) {
            throw new BoardException("There is already a piece on " + position);
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    public Piece remotePiace(Position position){
        if (!positionExists(position)) {
            throw new BoardException("Position not on the board");
        }
        if(getPiece(position) == null){
            return null;
        }
        Piece aux = getPiece(position);
        aux.position = null;
        pieces[position.getColumn()][position.getRow()] = null;
        return aux;
    }


    private boolean positionExists(int row, int column) {
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    public boolean positionExists(Position position) {
        return positionExists(position.getRow(), position.getColumn());
    }

    // Verifica se há uma peça na posição
    public boolean thereIsAPiece(Position position) {
        if (!positionExists(position)) {
            throw new BoardException("Position not on the board");
        }
        return getPiece(position) != null;
    }
}
