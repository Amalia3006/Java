package PlayerAndGame;

import BoardElements.*;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private final List<Player> players;
    private Player winner;

    public Game() {
        board = new Board();
        players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
        player.setGame(this);
    }

    public Board getBoard() {
        return board;
    }


    public void setBoard(Board board) {
        this.board = board;
    }

    public void setWinner(Player player) {
        this.winner = player;
    }


    public void start() {
        for (Player player : players) {
            new Thread(player).start();
//            System.out.println(player instanceof Runnable );

        }
    }

    public List<Player> getPlayers() {
        return players;
    }

    public Player getWinner() {
        return winner;
    }
}