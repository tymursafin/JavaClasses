package Class26.CardHW;

public class AmericanExpress extends Card{
    AmericanExpress(String creditCardType){
        super(creditCardType);
    }

    @Override
    public void issueCard() {
        System.out.println(creditCardType + " american express card is issued");
    }

    @Override
    public void closeCard() {
        System.out.println(creditCardType + " american express card is closed");
    }
}
