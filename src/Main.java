import Modelo.Cartao;
import Modelo.Compra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double limite;
        int opcao = 1;

        Scanner teclado = new Scanner(System.in);
        List<Compra> listaDeCompras = new ArrayList<>();

        System.out.println("Digite o limite do cartão:");
        limite = teclado.nextDouble();
        Cartao cartao = new Cartao(limite);

        while (cartao.getLimite()>0 && opcao != 0){
            teclado.nextLine();
            System.out.println("Digite o nome do produto: ");
            String nomeCompra = teclado.nextLine();
            System.out.println("Digite o valor do produto: ");
            double valorCompra = teclado.nextDouble();
            if(valorCompra > cartao.getLimite()){
                System.out.println("Valor do produto maior que o limite");
                break;
            }else {
                Compra compra = new Compra(nomeCompra, valorCompra);
                listaDeCompras.add(compra);
                System.out.println(listaDeCompras);
                cartao.atulizaLimite(compra.getValorProduto());
            }

            System.out.println("Deseja adicionar mais um produto?");
            System.out.println("Digite 0 para sair 1 para adicionar");
            opcao = teclado.nextInt();
        }
        System.out.println("========================\n");
        System.out.println("Valor de saldo restante do cartão: "+cartao.getLimite());
        System.out.println("Compras feitas: \n");


        Collections.sort(listaDeCompras);
        for (Compra compra: listaDeCompras){
            System.out.println(compra.toString());
        }

        System.out.println("\n========================");
    }
}