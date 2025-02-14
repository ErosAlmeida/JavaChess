package chess;
import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece{

    @SuppressWarnings("unused")
    private static String ChessPiece;
        private Color color;
        
            public Color getColor() {
            return color;
        }
    
            public ChessPiece(Board board, Color color) {
                super(board);
                this.color = color;
        }
    
        protected boolean isThereOpponentPiece(Position position){
         ChessPiece p = (ChessPiece) getBoard().getPiece(position);
        return p != null && p.getColor() != color;

    }
    
}
