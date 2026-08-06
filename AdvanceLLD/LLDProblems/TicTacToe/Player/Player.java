package TicTacToe.Player;

import TicTacToe.PlayingPiece.PlayingPiece;

public class Player {
    private final Integer id;
    private final String name;
    private final PlayingPiece playingPiece;

    public Player(Integer id, String name, PlayingPiece playingPiece) {
        this.id = id;
        this.name = name;
        this.playingPiece = playingPiece;
    }

    public String getName() {
        return name;
    }

    public PlayingPiece getPlayingPiece() {
        return playingPiece;
    }
}
