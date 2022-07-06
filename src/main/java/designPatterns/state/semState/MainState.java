package designPatterns.state.semState;

import designPatterns.state.semState.desconto.CalculaDesconto;
import designPatterns.state.semState.imposto.CalculadoraImpostos;
import designPatterns.state.semState.imposto.ICMS;
import designPatterns.state.semState.imposto.ISS;
import designPatterns.state.semState.orcamento.Orcamento;

import java.math.BigDecimal;

public class MainState {

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
