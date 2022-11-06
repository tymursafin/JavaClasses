package Class26.CardHW;

public abstract class Card {
    String creditCardType;

    protected Card(String creditCardType) {
        this.creditCardType = creditCardType;
    }
    public abstract void issueCard();

    public void closeCard(){
        System.out.println("Card is closed");
    }
}
