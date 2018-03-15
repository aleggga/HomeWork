package o21;

import java.util.ArrayList;
import java.util.List;

public class Table {

    private final int maxPlayers = 5;
    private final int maxGames = 100000;
    private CardDeck cardDeck = new CardDeck();
    private List<Player> players = new ArrayList<>();

    private Table(){};
    private static Table tableInstance;

    public static Table getTableInstance() {
        if(tableInstance == null){
            tableInstance = new Table();
        }
        return tableInstance;
    }


    void startGame(){
        //System.out.println("Starting new game");
        registerPalyers();
        cardDeck.shafleCards();

        for (Player player : players) {
            while (player.isPlayMoreCards()){
                player.receiveCard(cardDeck.getCard());
            }
            //player.showCards();
        }

        List<Player> win = getWinner();
        announceWinner(win);
        tearDown();

    }

    void tearDown() {
        for (Player player : players) {
            player.returnCards();
        }
    }

    private void announceWinner(List<Player> winner) {

        if (winner == null) {
            //System.out.println("We have no winner, all players over 21");
        }

        for (Player win : winner) {
            win.setMeAsAWinner();
        }

        if (winner.size() == 1) {
            //System.out.println("And the winner is.... player #" + winner.get(0).getTablePosition());
        }

        else {
            //System.out.println("We have several winners!!! Whohooo");
            for (Player win : winner) {
                //System.out.println("Player with table posotion #" + win.getTablePosition());
            }
        }
    }

    private List<Player> getWinner() {
        List<Player> winner = new ArrayList<>();

        for (int i = 21; i >= 2; i--) {
            for (Player player : players) {
                if (player.getTotalCardsValue() == i) {
                    winner.add(player);
                }
            }
            if (!winner.isEmpty()) {
                break;
            }
        } return winner;
    }


    private void registerPalyers() {
        if (players.size() != 0) {
            return;
        }
        for (int i = 0; i < maxPlayers ; i++) {
            players.add(new Player(i + 16, i + 1));
        }
    }


    void printGamesSummary() {
        for (Player player : players) {
            System.out.println("Player with table position #" + player.getTablePosition()
                    + " and riskLvl " + player.getMaxScoreToStop() + " won " + player.getGamesVon() + " time(s)");
        }
    }


    public static void main(String[] args) {
        Table table = Table.getTableInstance();
        int gameNum = 1;
        while (gameNum <= table.maxGames) {
            table.startGame();
            gameNum++;
        }
        System.out.println("All " + (gameNum - 1)  + " game(s) played, here is the win result");
        table.printGamesSummary();
    }
}
