package application;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class App {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            Locale.setDefault(Locale.US);

           ChessMatch chessMatch = new ChessMatch();
           UI.printBoard(chessMatch.getPieces()); 
           List<ChessPiece> captured = new ArrayList<>();

           while (true) {
                try{
                UI.clearScreen();
                UI.printMatch(chessMatch, captured);
                System.out.println();
                System.out.println("Source: ");
                ChessPosition source = UI.readChessPosition(sc);  
                
                boolean[][] possibleMoves = chessMatch.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces(),possibleMoves);

                System.out.println();
                System.out.println("Target: ");
                ChessPosition target = UI.readChessPosition(sc);
     
                ChessPiece caputredChessPiace = chessMatch.performChessMove(source, target);
                System.out.println(caputredChessPiace);

                if(caputredChessPiace != null){
                        captured.add(caputredChessPiace);
                }

                }
                catch(ChessException e){
                        System.out.println(e.getMessage());
                        sc.nextLine();
                }
                catch(InputMismatchException e){
                        System.out.println(e.getMessage());
                        sc.nextLine();
                }
           }
        
           
        } 

}  
    

