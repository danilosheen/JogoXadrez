package application;

import chess.ChessMatch;

//Programa principal

public class Program {

	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		
		for (int i=0; i<10; i++) {
			System.out.println("AA");
		}

	}

}
