package application;
import java.util.InputMismatchException;
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
           UI.printBoard(chessMatch.getPiace()); 

           while (true) {
                try{
                UI.clearScreen();
                UI.printBoard(chessMatch.getPiace());
                System.out.println();
                System.out.println("Source: ");
                ChessPosition source = UI.readChessPosition(sc);  
                
                System.out.println();
                System.out.println("Target: ");
                ChessPosition target = UI.readChessPosition(sc);
     
                ChessPiece caputredChessPiace = chessMatch.performChessMove(source, target);
                System.out.println(caputredChessPiace);
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
    

