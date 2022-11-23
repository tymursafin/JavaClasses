package class26.InsuranceHW;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Insurance> insurances = new ArrayList<>(3);
        insurances.add(new Car());
        insurances.add(new Pet());
        insurances.add(new Health());
        // calling all methods using for loop
        for (int i = 0; i < insurances.size(); i++) {
            insurances.get(i).getQuote();
            insurances.get(i).cancelInsurance();
        }
        // calling all methods using enhanced for loop
        for (Insurance insurance : insurances) {
            insurance.getQuote();
            insurance.cancelInsurance();
        }
        // calling all methods using iterator
        var iterator = insurances.iterator();
        while (iterator.hasNext()) {
            var obj = iterator.next();
            obj.getQuote();
            obj.cancelInsurance();
        }
    }
}
