package Class21;

public class CreditCard {
    public static void main(String[] args) {
        CreditCard obj1 = new CreditCard(4560, 3.08);
        System.out.println(obj1.interestCalculator());
        Visa obj2 = new Visa(1500, 2.9);
        System.out.println(obj2.interestCalculator());
        AX obj3 = new AX(2697, 3.56);
        System.out.println(obj3.interestCalculator());
    }

    double balance = 500;
    double interest = 17.99;
    final int NUMBER_OF_MONTHS = 12;

    public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    double interestCalculator() {
        double monthlyInterestRate = interest / NUMBER_OF_MONTHS;
        return balance * ((monthlyInterestRate) / 100);
    }

    static class Visa extends CreditCard {
        Visa(double balance, double interest) {
            super(balance, interest);
        }
    }

    static class AX extends CreditCard {
        AX(double balance, double interest) {
            super(balance, interest);
        }

        @Override
        double interestCalculator() {
            double dailyInterestRate = interest / 365;
            return balance * ((dailyInterestRate) / 100);
        }
    }
}
