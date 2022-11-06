package Class26.CardHW;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Card> cards = new LinkedList<>();
        cards.add(new Master("Travel credit"));
        cards.add(new Visa("Business credit"));
        cards.add(new AmericanExpress("Student credit"));

        // accessing all methods using for loop
        for (int i = 0; i < cards.size(); i++) {
            cards.get(i).issueCard();
            cards.get(i).closeCard();
        }
        // accessing all methods using for each loop
        for (Card card : cards) {
            card.issueCard();
            card.closeCard();
        }
        // accessing all methods using iterator
        var iterator = cards.iterator();
        while (iterator.hasNext()) {
            var obj = iterator.next();
            obj.issueCard();
            obj.closeCard();
        }
    }
}
