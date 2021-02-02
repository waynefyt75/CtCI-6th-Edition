package deck_of_card_v1;

public abstract class Card {
    protected Suit suit;
    protected int faceValue;

    public Card(Suit suit, int faceValue){
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public abstract int getValue();

}
