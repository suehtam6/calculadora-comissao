package br.senai.sp.jandira.ds1t.comissoes.Comissoes.model;


import java.util.Scanner;

public class Vendedor {

    String nomeVendedor;
    double totalVendas;
    double percentualComissao;
    double valorComissao;

    public void coletarDados(){
        Scanner leitor = new Scanner(System.in);

        //obtendo os dados dos vendedores
        System.out.println("** CALCULADORA DE COMISSÕES**");
        System.out.println("-------------------------------");

        //obtendo o nome do vendedor
        System.out.print("Nome do vendedor: ");
        nomeVendedor = leitor.nextLine();

        //obtendo o total de vendas do vendedor
        System.out.println("Total de vendas do(a) " + nomeVendedor + ":");
        totalVendas = leitor.nextDouble();

    calcularComissao();

    }


    public void calcularComissao(){

        if (totalVendas < 20000){
            percentualComissao = 5;

        } else {
            percentualComissao = 10;

        }

        valorComissao = totalVendas * percentualComissao / 100;

        exibirResultados();
    }

    public void exibirResultados(){


        String resultadoComDoisValores = String.format("%.2f", valorComissao);

        System.out.println("***************************");
        System.out.println("NOME DO VENDEDOR: " + nomeVendedor);
        System.out.println("TOTAL DE VENDAS: " + totalVendas);
        System.out.println("PERCENTUAL DE COMISSÃO: " + percentualComissao);
        System.out.println("VALOR DA COMISSÃO: R$" + resultadoComDoisValores);
        System.out.println("***************************");




    }




}
