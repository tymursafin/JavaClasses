package class26.CardHW;

public class Master extends Card{
    Master(String creditCardType) {
        super(creditCardType);
    }

    @Override
    public void issueCard() {
        System.out.println(creditCardType + " master card is issued");
    }

    @Override
    public void closeCard() {
        System.out.println(creditCardType + " master card is closed");
    }
}
