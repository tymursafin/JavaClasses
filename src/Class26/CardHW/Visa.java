package Class26.CardHW;

public class Visa extends Card {
    Visa(String creditCardType) {
        super(creditCardType);
    }

    @Override
    public void issueCard() {
        System.out.println(creditCardType + " visa card is issued");
    }

    @Override
    public void closeCard() {
        System.out.println(creditCardType + " visa card is closed");
    }
}
