public class UnitConverter implements Converter {
    @Override
    public double convertToEuro(double x) {
        return x * 4.20;
    }

    @Override
    public double convertToUSD(double x) {
        return x * 3.90;
    }

    @Override
    public double getConversionRate(String currency) {
        if (currency.equals("USD")) {
            return 3.90;
        } else if (currency.equals("Euro")) {
            return 4.20;
        }else{
            System.out.println("Unsupported currency: " + currency);
            return 0;
        }
    }
}
