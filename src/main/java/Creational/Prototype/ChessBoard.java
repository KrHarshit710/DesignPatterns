package Creational.Prototype;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;


@ToString
public class ChessBoard implements Prototype<ChessBoard>{

    private List<Piece> chessBoard;

    public ChessBoard(){
        this.chessBoard = new ArrayList<>();
    }

    public void addPiece(Piece piece){
        chessBoard.add(piece);
    }

    @Override
    public ChessBoard clone() {
        ChessBoard clonedChessBoard = new ChessBoard();
        for(Piece piece : chessBoard){
            clonedChessBoard.addPiece(piece.clone());
        }
        return clonedChessBoard;
    }


}
