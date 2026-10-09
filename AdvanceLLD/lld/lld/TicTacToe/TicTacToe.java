package lld.TicTacToe;

import lld.TicTacToe.Game.Game;
import lld.TicTacToe.Notification.InGameObserver;
import lld.TicTacToe.Notification.Observer;
import lld.TicTacToe.Player.Player;
import lld.TicTacToe.PlayingPiece.Piece;
import lld.TicTacToe.PlayingPiece.PlayingPieceFactory;
import lld.TicTacToe.WinningStrategy.NormalWinningStrategy;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("Tic Tac Toe running...");
        PlayingPieceFactory playingPieceFactory = new PlayingPieceFactory();

        Game game = new Game(4, new NormalWinningStrategy());

        Player player1 = new Player(101, "Vedant", playingPieceFactory.createPlayingPiece(Piece.X));
        Observer observerPlayer1 = new InGameObserver(player1);

        Player player2 = new Player(102, "Avishi", playingPieceFactory.createPlayingPiece(Piece.O));
        Observer observerPlayer2 = new InGameObserver(player2);

        game.setPlayer(player1);
        game.setPlayer(player2);

        game.subscribeToNotification(observerPlayer1);
        game.subscribeToNotification(observerPlayer2);

        game.play();
    }
}
