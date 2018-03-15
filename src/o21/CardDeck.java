package o21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {

    private List<Card> cardDeck = new ArrayList<>();
    private int i = 0;

    public CardDeck() {
        for (Rank a : Rank.values()) {
            for (Suit b : Suit.values()) {
                cardDeck.add(new Card(b,a));
            }
        }
    }

    Card getCard() {
        Card card = cardDeck.get(i);
        i++;
        return card;
    }

    void shafleCards() {
        Collections.shuffle(cardDeck);
        resetCardsCounter();
    }

    void resetCardsCounter() {
        i = 0;
    }

}
