package Creational.Prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
public class Piece implements Prototype<Piece> {
    private PieceType pieceType;
    private Color color;
    private Position position;

    Piece(PieceType pieceType, Color color, Position position){
        this.pieceType = pieceType;
        this.color = color;
        this.position = position;
    }

    @Override
    public Piece clone() {
        return new Piece(this.pieceType, this.color, this.position.clone());
    }
}
