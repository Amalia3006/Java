package PlayerAndGame;

import GraphElements.*;
import BoardElements.*;

public class Player implements Runnable {

    private static final long THINKING_TIME = 100;
    private String nameOfPlayer;
    private Game game;
    private Graph graph;

    public Player(String nameOfPlayer) {
        this.nameOfPlayer = nameOfPlayer;
        this.graph = new Graph();
    }

    private boolean play() throws InterruptedException {

        Board board = game.getBoard();
        if (board.isEmpty()) {
            return false;
        }
        graph.add(board.extract());
        Thread.sleep(THINKING_TIME);
        if (graph.isSpanningTree()) {
            game.setWinner(this);
        }
        return true;
    }

    public void run() {
        while (game.getWinner() == null) {
            try {
                if (play() == false) ;
                break;
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }
    // implement the toString() method

    public void setGame(Game game) {
        this.game = game;
    }

    public Game getGame() {
        return game;
    }

    @Override
    public String toString() {
        return "Player{" +
                "nameOfPlayer='" + nameOfPlayer + '\'' +
                ", game=" + game +
                ", graph=" + graph +
                '}';
    }
}

