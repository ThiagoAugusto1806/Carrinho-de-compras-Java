package Modelo;

public class Cartao {
    private double limite;

    public Cartao(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void atulizaLimite(double compra) {
        this.limite -= compra;
    }
}
