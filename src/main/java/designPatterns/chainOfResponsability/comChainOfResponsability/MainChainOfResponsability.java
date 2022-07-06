package designPatterns.chainOfResponsability.comChainOfResponsability;

import designPatterns.chainOfResponsability.comChainOfResponsability.desconto.CalculaDesconto;
import designPatterns.chainOfResponsability.comChainOfResponsability.imposto.CalculadoraImpostos;
import designPatterns.chainOfResponsability.comChainOfResponsability.imposto.ICMS;
import designPatterns.chainOfResponsability.comChainOfResponsability.imposto.ISS;
import designPatterns.chainOfResponsability.comChainOfResponsability.orcamento.Orcamento;

import java.math.BigDecimal;

public class MainChainOfResponsability {

    public static void main(String[] args){
        Orcamento orcamento = new Orcamento(new BigDecimal("1200"), 2);
        Orcamento orcamentoAux = new Orcamento(new BigDecimal("1000"), 2);
        CalculadoraImpostos calculadora = new CalculadoraImpostos();
        CalculaDesconto caculaDesconto = new CalculaDesconto();
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("                Impostos                ");
        System.out.println("valor do imposto: R$ " +  calculadora.calcular(orcamento, new ICMS()));
        System.out.println("valor do imposto: R$ " +  calculadora.calcular(orcamentoAux, new ISS()));


        System.out.println("------------------------------------------------------------------------------");
        System.out.println("                Desconto                ");
        System.out.println("Total de desconto R$ " + caculaDesconto.calcular(orcamento));
        System.out.println("Total de desconto R$ " + caculaDesconto.calcular(orcamentoAux));
        System.out.println("------------------------------------------------------------------------------");


    }
}
