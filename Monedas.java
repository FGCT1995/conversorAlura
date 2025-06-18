package ConversorDeMonedas;

public class Monedas {
    private Double USD;
    private Double ARS;
    private Double BRL;
    private Double PEN;

    public Double getUSD() {
        return USD;
    }

    public Double getARS() {
        return ARS;
    }

    public Double getPEN() {
        return PEN;
    }

    public Double getBRL() {
        return BRL;
    }

    @Override
    public String toString() {
        return "Monedas{" +
                "USD=" + USD +
                ", ARS=" + ARS +
                ", BRL=" + BRL +
                ", PEN=" + PEN +
                '}';
    }
}
