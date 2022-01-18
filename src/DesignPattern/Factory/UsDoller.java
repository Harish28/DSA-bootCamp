package DesignPattern.Factory;

public class UsDoller implements Currency {
    @Override
    public String getCurrencySymbol() {
        return "USD";
    }
}
