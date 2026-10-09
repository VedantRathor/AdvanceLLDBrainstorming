package lld.TicTacToe.WinningStrategy;

import lld.TicTacToe.Board.Board;
import lld.TicTacToe.Player.Player;

public interface WinningStrategy {
    boolean checkWinner(Board board, Player player);
    boolean isDraw(Board board);
}
