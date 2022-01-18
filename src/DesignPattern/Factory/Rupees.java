package DesignPattern.Factory;

public class Rupees implements Currency {
    @Override
    public String getCurrencySymbol() {
        return "Rs";
    }
}
