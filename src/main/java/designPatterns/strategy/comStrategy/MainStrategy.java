package designPatterns.strategy.comStrategy;

import designPatterns.strategy.comStrategy.imposto.CalculadoraImpostos;
import designPatterns.strategy.comStrategy.imposto.ICMS;
import designPatterns.strategy.comStrategy.imposto.ISS;
import designPatterns.strategy.comStrategy.orcamento.Orcamento;
import java.math.BigDecimal;

public class MainStrategy {

    public static void main(String[] args){
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraImpostos calculadora = new CalculadoraImpostos();
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("                Impostos                ");
        System.out.println("valor do imposto: R$ " +  calculadora.calcular(orcamento, new ICMS()));
        System.out.println("valor do imposto: R$ " +  calculadora.calcular(orcamento, new ISS()));
        System.out.println("------------------------------------------------------------------------------");
    }
}
