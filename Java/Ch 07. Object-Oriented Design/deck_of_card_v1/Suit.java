package deck_of_card_v1;

public enum Suit {
    Spade,
    Heart,
    Club,
    Diamond;

    public static Suit getSuitFromNumber(int num){
        switch (num){
            case 0: return Suit.Spade;
            case 1: return Suit.Heart;
            case 2: return Suit.Club;
            case 3: return Suit.Diamond;
            default: return null;
        }
    }
}
