package designPatterns.strategy.semStrategy;

import designPatterns.strategy.semStrategy.orcamento.Orcamento;
import designPatterns.strategy.semStrategy.imposto.CalculadoraImpostos;
import designPatterns.strategy.semStrategy.imposto.TipoImposto;

import java.math.BigDecimal;

public class MainStrategy {

    public static void main(String[] args){
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraImpostos calculadora = new CalculadoraImpostos();
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("valor do imposto: R$ " +  calculadora.calcular(orcamento, TipoImposto.ISS));

        System.out.println("------------------------------------------------------------------------------");

    }
}
