package o21;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private final int maxScoreToStop;
    private List<Card> myCards = new ArrayList<>();
    private int gamesVon;
    private boolean playMoreCards = true;
    private int totalCardsValue = 0;
    private int tablePosition;

    void returnCards() {
        myCards.clear();
        playMoreCards = true;
        totalCardsValue = 0;
    }

    public int getMaxScoreToStop() {
        return maxScoreToStop;
    }

    public Player(int maxScoreToStop, int tablePosition) {
        this.maxScoreToStop = maxScoreToStop;
        this.tablePosition = tablePosition;
    }

    boolean isPlayMoreCards() {
        return playMoreCards;
    }

    public int getTotalCardsValue() {
        return totalCardsValue;
    }

    public int getTablePosition() {
        return tablePosition;
    }

    public void receiveCard(Card newCard) {
        myCards.add(newCard);

        totalCardsValue += newCard.getRank().getValue();

        if (totalCardsValue >= maxScoreToStop) {
            playMoreCards = false;
        }
    }

    void setMeAsAWinner() {
        gamesVon++;
    }

    public int getGamesVon() {
        return gamesVon;
    }

    void showCards() {
        System.out.println("Player #" + getTablePosition() + " cards: " + myCards
            + " total value = " + totalCardsValue);
    }
}
