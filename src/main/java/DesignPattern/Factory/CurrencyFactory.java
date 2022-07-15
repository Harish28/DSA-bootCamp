package DesignPattern.Factory;

public class CurrencyFactory {
    public static Currency getCurrency(String type) {
        if(type.equals("India")) {
            return new Rupees();
        } else if(type.equals("USA")){
            return new UsDoller();
        } else {
            return null;
        }
    }
}
