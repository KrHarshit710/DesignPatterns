package Creational.Prototype;

import java.util.*;

public class Client {
    private static Deque<ChessBoard> gamePlay;
    public static void main(String[] args) {
        gamePlay = new ArrayDeque<>();
        ChessBoard chessBoard = new ChessBoard();

        chessBoard.addPiece(new Piece(PieceType.KING, Color.BLACK, new Position(1,1)));
        gamePlay.add(chessBoard.clone());

        chessBoard.addPiece(new Piece(PieceType.KING, Color.WHITE, new Position(8,8)));
        gamePlay.add(chessBoard.clone());

        chessBoard.addPiece(new Piece(PieceType.QUEEN, Color.BLACK, new Position(2,2)));
        gamePlay.add(chessBoard.clone());

        while (!gamePlay.isEmpty())
            System.out.println(gamePlay.pollLast());


    }
}
