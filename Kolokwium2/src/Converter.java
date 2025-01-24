public interface Converter {
    abstract double convertToEuro(double x);
    abstract double convertToUSD(double x);
    abstract double getConversionRate(String currency);
}
