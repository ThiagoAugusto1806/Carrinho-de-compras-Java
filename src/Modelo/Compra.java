package Modelo;

public class Compra implements Comparable<Compra>{
    private String nomeProduto;
    private double valorProduto;

    public Compra(String nomeProduto, double valorProduto) {
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }


    @Override
    public String toString() {
        return this.nomeProduto + " - " + this.valorProduto;
    }

    @Override
    public int compareTo(Compra compra) {
        if (this.valorProduto < compra.getValorProduto()) {
            return -1;
        }
        if (this.valorProduto > compra.getValorProduto()) {
            return 1;
        }
        return 0;
    }
}
