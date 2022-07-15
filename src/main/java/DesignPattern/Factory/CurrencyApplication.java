package DesignPattern.Factory;

public class CurrencyApplication {
    public static void main(String[] args) {
        String type1 = args[0];
        String type2 = args[1];
        String type3 = args[2];
        Currency c1 = CurrencyFactory.getCurrency(type1);
        Currency c2 = CurrencyFactory.getCurrency(type2);
        Currency c3 = CurrencyFactory.getCurrency(type3);
        System.out.println(c1.getCurrencySymbol());
        System.out.println(c2.getCurrencySymbol());
        System.out.println(c3.getCurrencySymbol());

    }
}
